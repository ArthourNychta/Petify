package com.Petify.Login;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.Petify.HomePage.HomePage;
import com.Petify.R;
import com.Petify.Register.Register;

import androidx.room.Room;

import java.lang.ref.WeakReference;

public class Login extends Activity implements View.OnClickListener
{
    private AppDatabase db;
    ProgressDialog p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.Login).setOnClickListener(this);
        db = AppDatabase.getInstance(getApplicationContext());
        p = new ProgressDialog(Login.this);
    }

    @Override
    public void onClick(View v) {
        final EditText txtUserName = (EditText)findViewById(R.id.username);
        final EditText txtPassword = (EditText)findViewById(R.id.password);
        String username = txtUserName.getText().toString();
        String password = txtPassword.getText().toString();

        switch(v.getId()) {
            case R.id.Login:
                SyncTask sync = new SyncTask(this);
                sync.execute(username, password);
                break;
        }
    }

    private static class SyncTask extends AsyncTask<String, Void, User> {
        private WeakReference<Login> activityWeakReference;

        SyncTask(Login login) {
            activityWeakReference = new WeakReference<Login>(login);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Login login =  activityWeakReference.get();
            if(login == null || login.isFinishing()){
                return;
            }
            login.p.setMessage("Logging in...");
            login.p.setIndeterminate(false);
            login.p.setCancelable(false);
            login.p.show();
        }

        @Override
        protected User doInBackground(String... strings) {
            Login login =  activityWeakReference.get();
            if(login == null || login.isFinishing()){
               return null;
            }
            UserDao dao = login.db.userDao();
            User temp = dao.findByName(strings[0], strings[1]);

            return temp;

        }

        @Override
        protected void onPostExecute(User temp){
            Login login =  activityWeakReference.get();
            if(login == null || login.isFinishing()){
                return;
            }
            try{
                if(temp != null)
                {
                    Toast.makeText(login,"Successfully Logged In", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(login, HomePage.class);
                    login.startActivity(intent);
                }else{
                    Toast.makeText(login, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(login, Login.class);
                    login.startActivity(intent);
                }
            }catch(Exception e)
            {
                Toast.makeText(login,e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    }
}
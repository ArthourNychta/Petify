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
        findViewById(R.id.Register).setOnClickListener(this);
        db = AppDatabase.getInstance(getApplicationContext());
    }

    @Override
    public void onClick(View v) {
        final EditText txtUserName = (EditText)findViewById(R.id.username);
        final EditText txtPassword = (EditText)findViewById(R.id.password);
        String username = txtUserName.getText().toString();
        String password = txtPassword.getText().toString();

        switch(v.getId()) {
            case R.id.Login:
                SyncTask sync = new SyncTask();
                sync.execute(username, password);
                break;
            case R.id.Register:
                Intent intent1 = new Intent(Login.this, Register.class);
                startActivity(intent1);
                break;
        }
//
    }

    private class SyncTask extends AsyncTask<String, Void, User> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            p = new ProgressDialog(Login.this);
            p.setMessage("Logging in...");
            p.setIndeterminate(false);
            p.setCancelable(false);
            p.show();
        }

        @Override
        protected User doInBackground(String... strings) {
            UserDao dao = db.userDao();
            User temp = dao.findByName(strings[0], strings[1]);

            return temp;

        }

        @Override
        protected void onPostExecute(User temp){
            try{
                if(temp != null)
                {
                    Toast.makeText(Login.this,"Successfully Logged In", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this, HomePage.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this,"Invalid Username/Password", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this, Login.class);
                    startActivity(intent);
                }
            }catch(Exception e)
            {
                Toast.makeText(Login.this,e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    }
}
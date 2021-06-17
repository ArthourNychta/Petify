package com.Petify.Register;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.room.Room;

import com.Petify.HomePage.HomePage;
import com.Petify.Login.AppDatabase;
import com.Petify.Login.Login;
import com.Petify.Login.User;
import com.Petify.Login.UserDao;
import com.Petify.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

import javax.xml.transform.Result;

public class Register extends Activity implements View.OnClickListener {
    private AppDatabase db;
    ProgressDialog p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.Register).setOnClickListener(this);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        db = AppDatabase.getInstance(getApplicationContext());
    }

    public void onClick (View v) {
        final EditText txtUserName = (EditText)findViewById(R.id.username);
        final EditText txtPassword = (EditText)findViewById(R.id.password);
        final EditText txtEmail = (EditText)findViewById(R.id.email);
        final EditText txtPhone = (EditText)findViewById(R.id.phone);

        String username = txtUserName.getText().toString();
        String email =  txtEmail.getText().toString();
        String password = txtPassword.getText().toString();
        String phone = txtPhone.getText().toString();

        try{
            if(username.length() > 5 && username.length() < 21){
                if(password.length() > 5 && password.length() < 21) {
                    SyncTask sync = new SyncTask();
                    User user = new User(username,password,email,phone);
                    sync.execute(user);

                    Intent intent = new Intent(Register.this, Login.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Register.this, "Please insert password between 5 to 20 length!", Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(Register.this, "Please insert username between 5 to 20 length!", Toast.LENGTH_LONG).show();
            }

        }catch (Exception e){
            Toast.makeText(Register.this,e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private class SyncTask extends AsyncTask<User, Void, User> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            p = new ProgressDialog(Register.this);
            p.setMessage("Registering...");
            p.setIndeterminate(false);
            p.setCancelable(false);
            p.show();
        }

        @Override
        protected User doInBackground(User... user) {
            UserDao dao = db.userDao();
            dao.insertUser(user[0]);

            return user[0];
        }
    }
}

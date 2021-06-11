package com.Petify.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.Petify.HomePage.HomePage;
import com.Petify.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.Login).setOnClickListener(this);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);

    }

    @Override
    public void onClick(View v) {
//        final EditText txtUserName = (EditText)findViewById(R.id.username);
//        final EditText txtPassword = (EditText)findViewById(R.id.password);
//
//        String username = txtUserName.getText().toString();
//        String password = txtPassword.getText().toString();
        Intent intent = new Intent(Login.this, HomePage.class);
        startActivity(intent);
//                try{
//                    if(username.length() > 0 && password.length() >0)
//                    {
//                        DbUserAdapter dbUser = new DbUserAdapter(Login.this);
//                        dbUser.open();
//
//                        if(dbUser.Login(username, password))
//                        {
//                            Toast.makeText(Login.this,"Successfully Logged In", Toast.LENGTH_LONG).show();
//                            Intent intent = new Intent(Login.this, HomePage.class);
//                            startActivity(intent);
//                        }else{
//                            Toast.makeText(Login.this,"Invalid Username/Password", Toast.LENGTH_LONG).show();
//                        }
//                        dbUser.close();
//                    }
//
//                }catch(Exception e)
//                {
//                    Toast.makeText(Login.this,e.getMessage(), Toast.LENGTH_LONG).show();
//                }
    }
}
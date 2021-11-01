package com.Petify.LandingPage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.Petify.Login.AppDatabase;
import com.Petify.Login.Login;
import com.Petify.R;
import com.Petify.Register.Register;

public class LandingPage extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage);
        findViewById(R.id.LoginStart).setOnClickListener(this);
        findViewById(R.id.RegisterStart).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.LoginStart:
                Intent intent = new Intent(this , Login.class);
                startActivity(intent);
                break;
            case R.id.RegisterStart:
                Intent intent1 = new Intent(this, Register.class);
                startActivity(intent1);
                break;
        }
    }
}

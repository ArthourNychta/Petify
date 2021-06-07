package com.Petify.HomePage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.Petify.R;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        findViewById(R.id.btn_findnearbyvet).setOnClickListener(this);
        findViewById(R.id.btn_gettoknowyourpet).setOnClickListener(this);
        findViewById(R.id.btn_petaccessories).setOnClickListener(this);
        findViewById(R.id.btn_petfood).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_gettoknowyourpet:
                break;
            case R.id.btn_petfood:
                break;
            case R.id.btn_petaccessories:
                break;
            case R.id.btn_findnearbyvet:
                break;
        }
    }
}
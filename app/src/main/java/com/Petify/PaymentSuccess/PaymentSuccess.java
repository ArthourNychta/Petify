package com.Petify.PaymentSuccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Petify.DogFoodPage.DogFoodPage;
import com.Petify.HomePage.HomePage;
import com.Petify.R;

public class PaymentSuccess extends AppCompatActivity implements View.OnClickListener {
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);
        home = (Button) findViewById(R.id.btn_home);
        home.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Go to Home Page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
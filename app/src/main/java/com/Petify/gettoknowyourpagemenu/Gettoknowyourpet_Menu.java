package com.Petify.gettoknowyourpagemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.Petify.HomePage.HomePage;
import com.Petify.PetAccessoriesSearch.PetAccessories;
import com.Petify.PetFoodSearch.PetFoodSearch_Page;
import com.Petify.R;

public class Gettoknowyourpet_Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gettoknowyourpet_menu);
        findViewById(R.id.btn_consultfood).setOnClickListener(this);
        findViewById(R.id.btn_consultHealth).setOnClickListener(this);
        findViewById(R.id.btn_other).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_consultfood:
                Toast.makeText(this, "Redirecting to Food Article Page", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(this, PetFoodSearch_Page.class);
//                startActivity(intent);
                break;
            case R.id.btn_consultHealth:
                Toast.makeText(this, "Redirecting to Health Article Page", Toast.LENGTH_SHORT).show();
//                Intent intent1 = new Intent(this, PetFoodSearch_Page.class);
//                startActivity(intent1);
                break;
            case R.id.btn_other:
                Toast.makeText(this, "Redirecting to Consult with Veterinarian", Toast.LENGTH_SHORT).show();
//                Intent intent2 = new Intent(this, HomePage.class);
//                startActivity(intent2);
                break;
        }
    }
}
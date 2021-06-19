package com.Petify.HomePage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.Petify.MapsActivity;
import com.Petify.PetAccessoriesSearch.PetAccessories;
import com.Petify.PetFoodSearch.PetFoodSearch_Page;
import com.Petify.R;
import com.Petify.gettoknowyourpagemenu.Gettoknowyourpet_Menu;

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
                Toast.makeText(this, "Redirecting to Get to Know Your Pet Menu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Gettoknowyourpet_Menu.class);
                startActivity(intent);
                break;
            case R.id.btn_petfood:
                Toast.makeText(this, "Redirecting to Pet Food Search Page", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, PetFoodSearch_Page.class);
                startActivity(intent1);
                break;
            case R.id.btn_petaccessories:
                Toast.makeText(this, "Redirecting to Pet Accessories Page Page", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, PetAccessories.class);
                startActivity(intent2);
                break;
            case R.id.btn_findnearbyvet:
                Toast.makeText(this, "Redirecting to Find Nearby Vet Page", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, MapsActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
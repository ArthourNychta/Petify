package com.Petify.PetFoodSearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.Petify.R;

public class PetFoodSearch_Page extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_food_search_page);
        findViewById(R.id.btn_findit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_findit:
                Intent intent = new Intent(this, PetFoodSearch_Page.class);
                startActivity(intent);
                break;
        }
    }
}
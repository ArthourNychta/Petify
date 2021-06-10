package com.Petify.PetAccessoriesSearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Petify.DogAccessories.CatAccessories;
import com.Petify.DogAccessories.DogAccessories;
import com.Petify.HomePage.HomePage;
import com.Petify.R;

public class PetAccessories extends AppCompatActivity implements View.OnClickListener {
    EditText petType, petRace;
    Button Find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_accessories);
        petType = (EditText) findViewById(R.id.pets_type);
        petRace= (EditText) findViewById(R.id.pet_race);
        Find = (Button) findViewById(R.id.btn_findit);
        Find.setOnClickListener(this);
    }

    @Override
        public void onClick(View v) {
            int check=0;
            if(petType.getText().toString().length()==0){
                petType.setError("Pet's Type Must be Filled");
            }else{
                check++;
            }
            if(petRace.getText().toString().length()==0){
                petRace.setError("Pet's Race Must be Filled");
            }else{
                check++;
            }
            if(petType.getText().toString().equals("dog")&&check==2){
                Toast.makeText(this, "Redirecting to Dog Accessories Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, DogAccessories.class);
                startActivity(intent);
            }else if (petType.getText().toString().equals("cat") &&check==2){
                Toast.makeText(this, "Redirecting to Cat Accessories Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, CatAccessories.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Pet's Type Must be \"Dog\" or \"Cat\"", Toast.LENGTH_SHORT).show();
            }
    }
}
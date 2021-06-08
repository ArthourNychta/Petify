package com.Petify.PetFoodSearch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Petify.DogFoodPage.DogFoodPage;
import com.Petify.R;

public class PetFoodSearch_Page extends AppCompatActivity implements View.OnClickListener {
    EditText petType, petBreed, petAge, petWeight;
    Button Find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_food_search_page);
        petType = (EditText) findViewById(R.id.pets_type);
        petBreed = (EditText) findViewById(R.id.pet_breed);
        petAge = (EditText) findViewById(R.id.pet_age);
        petWeight = (EditText) findViewById(R.id.pet_Weight);
        Find = (Button) findViewById(R.id.btn_findit);
        Find.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            if(petType.getText().toString().length()==0){
                petType.setError("Pet's Type Must be Filled");
            }else if(petType.getText().toString()!="Dog"||petType.getText().toString()!="Anjing"
            || petType.getText().toString()!="Cat" || petType.getText().toString()!="Kucing"){
                petType.setError("Pet Type Must be between 'Dog' or 'Cat'");
            }else if(petBreed.getText().toString().length()==0){
                petBreed.setError("Pet's Breed Must be Filled");
            }else if(petAge.getText().toString().length()==0){
                petAge.setError("Pet's Age Must be Filled");
            }else if(petWeight.getText().toString().length() ==0){
                petWeight.setError("Pet's Weight Must be Filled");
            }else{
                if(petType.getText().toString().equals("Dog")||
                        petType.getText().toString().equals("Anjing")){
                        Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this, DogFoodPage.class);
                        startActivity(intent);
                }else if (petType.getText().toString().equals("Cat") ||
                        petType.getText().toString().equals("Kucing")){
                        Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(this,SecondActivity.class);
//                        startActivity(intent);
                }
            }


    }
}
package com.Petify.PetFoodSearch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Petify.DogFoodPage.CatFoodPage;
import com.Petify.DogFoodPage.DogFoodPage;
import com.Petify.HomePage.HomePage;
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
        int check=0;
            if(petType.getText().toString().length()==0){
                petType.setError("Pet's Type Must be Filled");
            }else{
                check++;
            }
            if(petBreed.getText().toString().length()==0){
                petBreed.setError("Pet's Breed Must be Filled");
            }else{
                check++;
            }
            if(petAge.getText().toString().length()==0){
                petAge.setError("Pet's Age Must be Filled");
            }else{
                check++;
            }
            if(petWeight.getText().toString().length() ==0){
                petWeight.setError("Pet's Weight Must be Filled");
            }else{
                check++;
            }
            if(petType.getText().toString().equals("dog")&&check==4){
                Toast.makeText(this, "Redirecting to Dog Food Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, DogFoodPage.class);
                startActivity(intent);
            }else if (petType.getText().toString().equals("cat") &&check==4){
                Toast.makeText(this, "Redirecting to Cat Food Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, CatFoodPage.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Pet's Type Must be \"Dog\" or \"Cat\"", Toast.LENGTH_SHORT).show();
            }
    }
}
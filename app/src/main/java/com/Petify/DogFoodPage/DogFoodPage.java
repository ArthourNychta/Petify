package com.Petify.DogFoodPage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.Petify.R;

public class DogFoodPage extends AppCompatActivity implements View.OnClickListener {
    TextView quantity1, quantity2, quantity3, quantity4, Total;
    Button  checkout;
    int quantityIndex1=0, quantityIndex2=0, quantityIndex3=0, quantityIndex4=0;
    int price1 =0, price2=0, price3=0, price4=0;
    int temp1 =0, temp2=0, temp3=0, temp4=0;
    ImageButton  minus1, minus2, minus3, minus4, plus1, plus2, plus3, plus4, cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_food_page);
        Total = (TextView) findViewById(R.id.totalPrice);
        quantity1 = (TextView) findViewById(R.id.quantity1);
        quantity2 = (TextView) findViewById(R.id.quantity2);
        quantity3 = (TextView) findViewById(R.id.quantity3);
        quantity4 = (TextView) findViewById(R.id.quantity4);
        minus1 = (ImageButton) findViewById(R.id.btn_minus1);
        minus2 = (ImageButton) findViewById(R.id.btn_minus2);
        minus3 = (ImageButton) findViewById(R.id.btn_minus3);
        minus4 = (ImageButton) findViewById(R.id.btn_minus4);
        plus1 = (ImageButton) findViewById(R.id.btn_plus1);
        plus2 = (ImageButton) findViewById(R.id.btn_plus2);
        plus3 = (ImageButton) findViewById(R.id.btn_plus3);
        plus4 = (ImageButton) findViewById(R.id.btn_plus4);
        cart = (ImageButton) findViewById(R.id.btn_cart);
        checkout = (Button) findViewById(R.id.btn_checkout);
        Total.getText().equals(TotalPrice(price1,price2,price3,price4));
        minus1.setOnClickListener(this);
        minus2.setOnClickListener(this);
        minus3.setOnClickListener(this);
        minus4.setOnClickListener(this);
        plus1.setOnClickListener(this);
        plus2.setOnClickListener(this);
        plus3.setOnClickListener(this);
        plus4.setOnClickListener(this);
        cart.setOnClickListener(this);
        checkout.setOnClickListener(this);
    }

    public static int TotalPrice(int price1, int price2, int price3, int price4){
        int total = 0;
        total = price1 + price2 + price3 + price4;
        return total;
    }

    public static int calculate1 (int quantity){
        int total = quantity * 25000;
        return total;
    }
    public static int calculate2 (int quantity){
        int total = quantity * 18000;
        return total;
    }
    public static int calculate3 (int quantity){
        int total = quantity * 100000;
        return total;
    }
    public static int calculate4 (int quantity){
        int total = quantity * 70500;
        return total;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_cart:
                if(quantityIndex1==0||quantityIndex2==0||quantityIndex3==0||quantityIndex4==0){
                    Toast.makeText(this, "You Must Choose your Pet Food First", Toast.LENGTH_SHORT).show();
                    break;
                }else{
//                    Intent intent = new Intent(this,SecondActivity.class);
//                    startActivity(intent);
                    break;
                }
            case R.id.btn_checkout:
                if(quantityIndex1==0||quantityIndex2==0||quantityIndex3==0||quantityIndex4==0){
                    Toast.makeText(this, "You Must Choose your Pet Food First", Toast.LENGTH_SHORT).show();
                    break;
                }else{
//                    Intent intent = new Intent(this,SecondActivity.class);
//                    startActivity(intent);
                    break;
                }
            case R.id.btn_minus1 :
                if(quantityIndex1==0){
                    break;
                }else{
                    quantityIndex1--;
                    quantity1.getText().equals(quantityIndex1);
                    temp1 = Integer.valueOf(quantity1.toString());
                    price1 = calculate1(temp1);
                    break;
                }
            case R.id.btn_plus1 :
                quantityIndex1++;
                quantity1.getText().equals(quantityIndex1);
                temp1 = Integer.valueOf(quantity1.toString());
                price1 = calculate1(temp1);
                break;

            case R.id.btn_minus2 :
                if(quantityIndex2==0){
                    break;
                }else{
                    quantityIndex2--;
                    quantity2.getText().equals(quantityIndex2);
                    temp2 = Integer.valueOf(quantity2.toString());
                    price2 = calculate2(temp2);
                    break;
                }
            case R.id.btn_plus2 :
                quantityIndex2++;
                quantity2.getText().equals(quantityIndex2);
                temp2 = Integer.valueOf(quantity2.toString());
                price2 = calculate2(temp2);
                break;

            case R.id.btn_minus3:
                if(quantityIndex3==0){
                    break;
                }else{
                    quantityIndex3--;
                    quantity3.getText().equals(quantityIndex3);
                    temp3 = Integer.valueOf(quantity3.toString());
                    price3 = calculate3(temp3);
                    break;
                }
            case R.id.btn_plus3 :
                quantityIndex3++;
                quantity3.getText().equals(quantityIndex3);
                temp3 = Integer.valueOf(quantity3.toString());
                price3 = calculate3(temp3);
                break;

            case R.id.btn_minus4 :
                if(quantityIndex4==0){
                    break;
                }else{
                    quantityIndex4--;
                    quantity4.getText().equals(quantityIndex4);
                    temp4 = Integer.valueOf(quantity4.toString());
                    price4 = calculate4(temp4);
                    break;
                }
            case R.id.btn_plus4 :
                quantityIndex4++;
                quantity4.getText().equals(quantityIndex4);
                temp4 = Integer.valueOf(quantity4.toString());
                price4 = calculate4(temp4);
                break;
        }
    }
}
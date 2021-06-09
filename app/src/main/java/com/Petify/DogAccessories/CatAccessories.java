package com.Petify.DogAccessories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.Petify.PaymentSuccess.PaymentSuccess;
import com.Petify.R;

public class CatAccessories extends AppCompatActivity implements View.OnClickListener {
    int number, number2, number3, number4, check=0;
    TextView quantity1,quantity2,quantity3,quantity4,totalPrice;
    ImageView plus, minus, plus2, minus2, plus3, minus3, plus4, minus4;
    Context context;
    Button checkout;
    int totalprice=0, price1=0,price2=0,price3=0,price4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_accessories);
        context = this;
        plus = (ImageView) findViewById(R.id.btn_plus1);
        minus = (ImageView) findViewById(R.id.btn_minus1);
        quantity1 = (TextView) findViewById(R.id.quantity1);
        plus2 = (ImageView) findViewById(R.id.btn_plus2);
        minus2 = (ImageView) findViewById(R.id.btn_minus2);
        quantity2 = (TextView) findViewById(R.id.quantity2);
        plus3 = (ImageView) findViewById(R.id.btn_plus3);
        minus3 = (ImageView) findViewById(R.id.btn_minus3);
        quantity3 = (TextView) findViewById(R.id.quantity3);
        plus4 = (ImageView) findViewById(R.id.btn_plus4);
        minus4 = (ImageView) findViewById(R.id.btn_minus4);
        quantity4 = (TextView) findViewById(R.id.quantity4);
        totalPrice = (TextView) findViewById(R.id.totalPrice);
        checkout = (Button) findViewById(R.id.btn_checkout);
        checkout.setOnClickListener(this);

        totalprice = price1+price2+price3+price4;
        totalPrice.setText("" + totalprice);

        quantity1.setText(""+number);

        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                number++;
                check=1;
                quantity1.setText(""+number);
                price1 = number*18000;
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(number==0){
                    quantity1.setText(""+0);
                    price1 = number*18000;
                }else{
                    number--;
                    quantity1.setText(""+number);
                    price1 = number*18000;
                }
            }
        });

        plus2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                number2++;
                check=1;
                quantity2.setText(""+number2);
                price2 = number2*140000;
            }
        });

        minus2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(number2==0){
                    quantity2.setText(""+0);
                    price2 = number2*140000;
                }else{
                    number2--;
                    quantity2.setText(""+number2);
                    price2 = number2*140000;
                }
            }
        });

        plus3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                number3++;
                check=1;
                quantity3.setText(""+number3);
                price3 = number3*108000;
            }
        });

        minus3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(number3==0){
                    quantity3.setText(""+0);
                    price3 = number3*108000;
                }else{
                    number3--;
                    quantity3.setText(""+number3);
                    price3 = number3*108000;
                }
            }
        });

        plus4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                number4++;
                check=1;
                quantity4.setText(""+number4);
                price4 = number4*109000;
            }
        });

        minus4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(number4==0){
                    quantity4.setText(""+0);
                    price4 = number4*109000;
                }else{
                    number4--;
                    quantity4.setText(""+number4);
                    price4 = number4*109000;
                }
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_checkout:
                if(check==0){
                    Toast.makeText(this, "You Must Choose At Least One Product To Checkout", Toast.LENGTH_SHORT).show();
                    break;
                }else{
                    Toast.makeText(this, "Redirecting to Payment Page", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, PaymentSuccess.class);
                    startActivity(intent);
                    break;
                }
        }
    }
}
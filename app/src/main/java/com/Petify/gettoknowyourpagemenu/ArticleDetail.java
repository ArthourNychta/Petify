package com.Petify.gettoknowyourpagemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.Petify.R;

public class ArticleDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        // panggil lagi
        ImageView ivImageArtikel2;
        TextView tvJudulArtikel2;
        TextView tvisiArtikel;

        // panggil id juga
        ivImageArtikel2 = findViewById(R.id.ivImageArtikel2);
        tvJudulArtikel2 = findViewById(R.id.tvJudulArtikel2);
        tvisiArtikel = findViewById(R.id.tvisiArtikel);

        // ambil data yang dioper dari adapter
        Intent intent = getIntent();
        ivImageArtikel2.setImageResource(intent.getIntExtra("gambarArtikel", 0));
        tvJudulArtikel2.setText(intent.getStringExtra("judulArtikel"));
        tvisiArtikel.setText(intent.getStringExtra("isiArtikel"));
    }

}
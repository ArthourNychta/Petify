package com.Petify.gettoknowyourpagemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.Petify.R;

import java.util.ArrayList;

public class Food_ArticlePage extends AppCompatActivity {

    ArrayList<ArticleTemplate> listArtikel;
    RecyclerView rvArtikel;
    ArticleAdapter artikelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_article_page);

        listArtikel = new ArrayList<>();

        // apa aja yang mau dimasukin
        ArticleTemplate artikel1 = new ArticleTemplate("7 Variasi Makanan Sehat untuk Anjing agar Tidak Bosan", "Bicara soal makanan anjing, di pasaran tentu sudah banyak sekali jenis dan mereknya...", "ini isi 1 ini isi 1", R.drawable.food_art1, "https://www.halodoc.com/artikel/7-variasi-makanan-sehat-untuk-anjing-agar-tidak-bosan");
        ArticleTemplate artikel2 = new ArticleTemplate("8 Rekomendasi Makanan Kucing Berkualitas Terbaik 2020. Disertai Tips Memilih!", "hIngin mencari merek makanan kucing yang berkualitas? Tapi, inginnya...", "ini isi 1 ini isi 1", R.drawable.food_art2, "https://www.99.co/blog/indonesia/rekomendasi-makanan-kucing-terbaik/");
        ArticleTemplate artikel3 = new ArticleTemplate("Tips Memilih Makanan yang Tepat Untuk Hewan Kesayangan Anda", "Ketika kita memutuskan untuk memelihara hewan kesayangan, anjing maupun kucing, kita harus paham...", "ini isi 1 ini isi 1", R.drawable.food_art3, "https://hewan-kesayangan.fkh.ugm.ac.id/2018/10/04/tips-memilih-makanan-yang-tepat-untuk-hewan-kesayangan-anda/");

        // add jangan lupa, kalo ga dia ga masuk ke array list
        listArtikel.add(artikel1);
        listArtikel.add(artikel2);
        listArtikel.add(artikel3);

        // ini untuk setting yang recycle view nya
        rvArtikel = findViewById(R.id.rvListArtikel);

        LinearLayoutManager llManager = new LinearLayoutManager(this);
        rvArtikel.setLayoutManager(llManager);

        //ini untuk setting adapternya
        artikelAdapter = new ArticleAdapter(this, listArtikel);
        rvArtikel.setAdapter(artikelAdapter);

    }
}
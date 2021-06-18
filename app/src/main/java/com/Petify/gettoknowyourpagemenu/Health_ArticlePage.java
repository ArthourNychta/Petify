package com.Petify.gettoknowyourpagemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.Petify.R;

import java.util.ArrayList;

public class Health_ArticlePage extends AppCompatActivity {
    ArrayList<ArticleTemplate> listArtikel;
    RecyclerView rvArtikel;
    ArticleAdapter artikelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_article_page);

        listArtikel = new ArrayList<>();

        // apa aja yang mau dimasukin
        ArticleTemplate artikel1 = new ArticleTemplate("6 Cara Merawat Binatang Peliharaan, Sayangi Hewan dengan Cara yang Benar", "Cara merawat binatang peliharaan sebenarnya tidaklah sesulit yang dibayangkan oleh banyak orang. Sebagian besar...", "ini isi 1 ini isi 1", R.drawable.health_art1, "https://www.merdeka.com/trending/6-cara-merawat-binatang-peliharaan-sayangi-hewan-dengan-cara-yang-benar-kln.html");
        ArticleTemplate artikel2 = new ArticleTemplate("Tips menjaga kesehatan hewan peliharaan dan lingkungan", "Memelihara hewan tentu sangat menyenangkan. Anda bisa bermain dan bercanda bersamanya. Namun,...", "ini isi 1 ini isi 1", R.drawable.health_art2, "https://www.merdeka.com/gaya/tips-menjaga-kesehatan-hewan-peliharaan-dan-lingkungan.html");
        ArticleTemplate artikel3 = new ArticleTemplate("8 Cara Merawat Hewan Peliharaan Dengan Baik Agar Si Manis Dapat Betah Tinggal Di Rumah", "Kamu ingin memelihara hewan di rumah? Sebelum memelihara hewan, cari tahu terlebih dahulu bagaimana cara...", "ini isi 1 ini isi 1", R.drawable.health_art3, "https://www.99.co/blog/indonesia/cara-merawat-hewan-peliharaan-di-rumah/");
        ArticleTemplate artikel4 = new ArticleTemplate("Kesehatan Hewan", "Memiliki hewan peliharaan dapat memberikan banyak manfaat kesehatan. Hewan...", "ini isi 1 ini isi 1", R.drawable.health_art4, "https://www.halodoc.com/kesehatan/kesehatan-hewan");
        ArticleTemplate artikel5 = new ArticleTemplate("Menjaga Kesehatan Hewan Peliharaan Di Masa Pandemi COVID-19", "Kamu ingin memelihara hewan di rumah? Sebelum memelihara hewan, cari tahu terlebih dahulu bagaimana cara...", "ini isi 1 ini isi 1", R.drawable.health_art5, "https://disnakkeswan.jatengprov.go.id/read/menjaga-kesehatan-hewan-peliharaan-di-masa-pandemi-covid-19");
        ArticleTemplate artikel6 = new ArticleTemplate("Manfaat dan Risiko Memiliki Hewan Peliharaan", "Hewan peliharaan tidak hanya dapat menghibur Anda dan keluarga, tetapi juga baik bagi kesehatan tubuh. Namun, jika tidak dirawat...", "ini isi 1 ini isi 1", R.drawable.health_art6, "https://www.alodokter.com/sisi-positif-dan-negatif-memiara-hewan");

        // add jangan lupa, kalo ga dia ga masuk ke array list
        listArtikel.add(artikel1);
        listArtikel.add(artikel2);
        listArtikel.add(artikel3);
        listArtikel.add(artikel4);
        listArtikel.add(artikel5);
        listArtikel.add(artikel6);

        // ini untuk setting yang recycle view nya
        rvArtikel = findViewById(R.id.rvListArtikel);

        LinearLayoutManager llManager = new LinearLayoutManager(this);
        rvArtikel.setLayoutManager(llManager);

        //ini untuk setting adapternya
        artikelAdapter = new ArticleAdapter(this, listArtikel);
        rvArtikel.setAdapter(artikelAdapter);
    }
}
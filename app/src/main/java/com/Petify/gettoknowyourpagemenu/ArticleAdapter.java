package com.Petify.gettoknowyourpagemenu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Petify.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolder> {
    // STEP 3 - panggil variable yang dipake dan generate constructornya juga
    Context ctx;
    ArrayList<ArticleTemplate> listArtikel;

    public ArticleAdapter(Context ctx, ArrayList<ArticleTemplate> listArtikel) {
        this.ctx = ctx;
        this.listArtikel = listArtikel;
    }

    @NonNull
    @Override
    public ArticleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // STEP 4
        // ini untuk masukin barang ke list yang udah kita buat (kan tadi udah buat template yang item_row_artikel)

        View view = LayoutInflater.from(ctx).inflate(R.layout.item_row_artikel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleAdapter.ViewHolder holder, int position) {
        //STEP 5
        // untuk nampilin isi dari artikel yang ada
        ArticleTemplate artikel = listArtikel.get(position);
        holder.ivImageArtikel.setImageResource(artikel.getGambarArtikel());
        holder.tvJudulArtikel.setText(artikel.getJudulArtikel());
        holder.tvDeskripsiArtikel.setText(artikel.getDeskripsiArtikel());
    }

    @Override
    public int getItemCount() {

        // STEP 6
        // ini untuk nampilin seberapa banyak sih data yang ditampilin
        return listArtikel.size();
    }

    // STEP 2
    // Ketik implements View.OnClickListener --> bakal merah2 --> hover --> lampu --> create constructor --> implements lagi
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //panggil juga apa aja yang bakal ke ganti dan ke pake di row nanti
        ImageView ivImageArtikel;
        TextView tvJudulArtikel;
        TextView tvDeskripsiArtikel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // panggil id
            ivImageArtikel = itemView.findViewById(R.id.ivImageArtikel);
            tvJudulArtikel = itemView.findViewById(R.id.tvJudulArtikel);
            tvDeskripsiArtikel = itemView.findViewById(R.id.tvDeskripsiArtikel);

            // ini biar listnya bisa di klik :D
            itemView.setOnClickListener(this);
        }

        // STEP 7
        // ini nanti pas di klik, listnya bisa melakukan sesuatu
        // jangan lupa buat next activitynya dulu
        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ArticleTemplate artikel = listArtikel.get(position);

            // ini untuk ke activity yang selanjutnya + ambil data yang diperluin
//            Intent intent = new Intent(v.getContext(), ArticleDetail.class);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(artikel.getUrl()));

//            intent.putExtra("judulArtikel", artikel.getJudulArtikel());
//            intent.putExtra("deskripsiArtikel", artikel.getDeskripsiArtikel());
//            intent.putExtra("isiArtikel", artikel.getIsiAtrikel());
//            intent.putExtra("gambarArtikel", artikel.getGambarArtikel());
            v.getContext().startActivity(intent);
        }
    }
}

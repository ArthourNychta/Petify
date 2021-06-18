package com.Petify.gettoknowyourpagemenu;

public class ArticleTemplate {
    String judulArtikel;
    String deskripsiArtikel;
    String isiAtrikel;
    String url;
    int gambarArtikel;

    //ini tinggal klik kanan --> generate -->  constructor + getter setter aja

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArticleTemplate(String judulArtikel, String deskripsiArtikel, String isiAtrikel, int gambarArtikel, String url) {
        this.judulArtikel = judulArtikel;
        this.deskripsiArtikel = deskripsiArtikel;
        this.isiAtrikel = isiAtrikel;
        this.gambarArtikel = gambarArtikel;
        this.url = url;
    }

    public String getJudulArtikel() {
        return judulArtikel;
    }

    public void setJudulArtikel(String judulArtikel) {
        this.judulArtikel = judulArtikel;
    }

    public String getDeskripsiArtikel() {
        return deskripsiArtikel;
    }

    public void setDeskripsiArtikel(String deskripsiArtikel) {
        this.deskripsiArtikel = deskripsiArtikel;
    }

    public String getIsiAtrikel() {
        return isiAtrikel;
    }

    public void setIsiAtrikel(String isiAtrikel) {
        this.isiAtrikel = isiAtrikel;
    }

    public int getGambarArtikel() {
        return gambarArtikel;
    }

    public void setGambarArtikel(int gambarArtikel) {
        this.gambarArtikel = gambarArtikel;
    }
}

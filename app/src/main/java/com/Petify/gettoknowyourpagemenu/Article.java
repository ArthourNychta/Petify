package com.Petify.gettoknowyourpagemenu;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.RoomDatabase;
import java.util.List;

@Entity(tableName = "PetifyArticleDB")
public class Article {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ArticleId")
    public int id;

    @ColumnInfo(name = "ArticleName")
    public String name;

    @ColumnInfo(name = "ArticleDesc")
    public String desc;

    @ColumnInfo(name = "ArticleCont")
    public String cont;

    @ColumnInfo(name = "ArticleUrl")
    public String url;

    public Article(){

    }

    @Ignore
    public Article(String name, String description, String content, String url){
        this.name = name;
        this.desc = description;
        this.cont = content;
        this.url = url;
    }
}

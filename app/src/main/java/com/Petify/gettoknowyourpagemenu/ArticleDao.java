package com.Petify.gettoknowyourpagemenu;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ArticleDao {
    @Query("SELECT * FROM PetifyArticleDB")
    List<Article> getAll();

    @Query(("SELECT * FROM PetifyArticleDB WHERE ArticleId IN (:articleIds)"))
    List<Article> loadAllbyIds(int[] articleIds);

    @Query("SELECT * FROM PetifyArticleDB WHERE ArticleName LIKE :ArticleName"")
    Article findByName(String ArticleName);

    @Insert
    void insertArticle(Article... articles);

    @Delete
    void delete(Article article);
}

package com.Petify.gettoknowyourpagemenu;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ArticleTemplate.class}, version = 1, exportSchema = false)
public abstract class ArticleDatabase extends RoomDatabase{

}

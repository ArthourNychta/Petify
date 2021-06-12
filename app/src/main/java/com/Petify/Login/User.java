package com.Petify.Login;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.RoomDatabase;

import java.util.List;

@Entity(tableName = "PetifyUserDB")
public class User {

    @PrimaryKey
    @ColumnInfo(name = "UserId")
    public int Id;

    @ColumnInfo(name = "Username")
    public String Username;

    @ColumnInfo(name = "Password")
    public String Password;

    @ColumnInfo(name = "EmailAddress")
    public String EmailAddress;

}

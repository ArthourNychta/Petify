package com.Petify.Login;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM PetifyUserDB")
    List<User> getAll();

    @Query("SELECT * FROM PetifyUserDB WHERE UserId IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM PetifyUserDB WHERE Username LIKE :Username AND Password LIKE :Password")
    User findByName(String Username, String Password);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);

}
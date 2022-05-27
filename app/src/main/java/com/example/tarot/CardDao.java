package com.example.tarot;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CardDao {

    @Insert
    void insert(Card card);

    @Update
    void update(Card card);

    @Delete
    void delete(Card card);

    @Query("DELETE FROM Card WHERE id = :id")
    void deleteCardById(long id);

    @Query("SELECT * FROM Card")
    List<Card> getAll();

    @Query("SELECT * FROM Card WHERE id = :id")
    Card getById(long id);
}

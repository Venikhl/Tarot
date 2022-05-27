package com.example.tarot;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SignDao {

    @Insert
    void insert(Sign sign);

    @Update
    void update(Sign sign);

    @Delete
    void delete(Sign sign);

    @Query("DELETE FROM Sign WHERE id = :id")
    void deleteSignById(long id);

    @Query("SELECT * FROM Sign")
    List<Sign> getAll();

    @Query("SELECT * FROM Sign WHERE id = :id")
    Card getById(long id);
}

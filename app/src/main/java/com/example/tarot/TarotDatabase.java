package com.example.tarot;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Card.class, Sign.class}, version = 1)
public abstract class TarotDatabase extends RoomDatabase {
    public abstract CardDao cardDao();
    public abstract SignDao signDao();
}

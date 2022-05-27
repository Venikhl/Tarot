package com.example.tarot;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {
    private static App instance;

    private TarotDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(
                this,
                TarotDatabase.class,
                "Tarot.db").allowMainThreadQueries().build();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }

    public TarotDatabase getDatabase() {
        return database;
    }
}
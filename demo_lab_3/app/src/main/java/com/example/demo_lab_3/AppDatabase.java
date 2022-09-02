package com.example.demo_lab_3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Inex.class},version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
        private static AppDatabase appDatabase;

        public abstract InexDao getInexDao();

        public static AppDatabase getAppDatabase(Context context){
            if(appDatabase==null){
                appDatabase = Room.databaseBuilder(context,AppDatabase.class,"inex").build();

            }
            return  appDatabase;
        }
}

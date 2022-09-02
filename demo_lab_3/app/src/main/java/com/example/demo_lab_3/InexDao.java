package com.example.demo_lab_3;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface InexDao {
    @Insert
    void insert(Inex... inexes);

    @Delete
    void delete(Inex... inexes);

    @Update
    void update(Inex inex);

    @Query("select * from inex")
    LiveData<List<Inex>> getAllInex();
}

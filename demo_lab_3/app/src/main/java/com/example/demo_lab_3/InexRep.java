package com.example.demo_lab_3;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class InexRep {
    private  AppDatabase appDatabase;
    private InexDao inexDao;

    public InexRep(Application application){
        appDatabase = AppDatabase.getAppDatabase(application);
        inexDao = appDatabase.getInexDao();
    }

    public void insert(Inex... inexes){
        inexDao.insert(inexes);
    }

    public void update(Inex inex){
        inexDao.update(inex);
    }

    public void delete(Inex... inexes){
        inexDao.delete(inexes);
    }

    public LiveData<List<Inex>> getAllInex(){
        return  inexDao.getAllInex();
    }

}

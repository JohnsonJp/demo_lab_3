package com.example.demo_lab_3;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class InexViewModel extends AndroidViewModel {
    private InexRep inexRep;

    public InexViewModel(Application application){
        super(application);
        inexRep = new InexRep(application);
    }

    public void insert(Inex... inexes){
        inexRep.insert(inexes);
    }

    public void update(Inex inex){
        inexRep.update(inex);
    }

    public void delete(Inex... inexes){
        inexRep.delete(inexes);
    }

    public LiveData<List<Inex>> getAllInex(){
        return  inexRep.getAllInex();
    }
}

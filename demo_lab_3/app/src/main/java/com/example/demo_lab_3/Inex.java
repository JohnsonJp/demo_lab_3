package com.example.demo_lab_3;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Inex {
    @PrimaryKey
    @NonNull
    private int id;
    private String forwhat;
//    @ColumnInfo(name = "amou")
    private String amount;

    public Inex(int id, String forwhat, String amount) {
        this.id = id;
        this.forwhat = forwhat;
        this.amount = amount;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull  int id) {
        this.id = id;
    }

    public String getForwhat() {
        return forwhat;
    }

    public void setForwhat(String forwhat) {
        this.forwhat = forwhat;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

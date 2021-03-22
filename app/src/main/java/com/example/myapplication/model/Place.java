package com.example.myapplication.model;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;

public class Place {

    private final Integer id;
    private final String Name;

    public Place(int id, String Name) {

        this.id = id;
        this.Name = Name;
    }
  public Integer getId() {return id;}
  public String getName() {return  Name;}

}

package com.example.myapplication.model;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;

public class Room {

    private final Integer id;
    private final String Name;

    public Room(int id, String Name) {

        this.id = id;
        this.Name = Name;
    }
  public Integer getId() {return id;}
  public String getName() {return  Name;}

}

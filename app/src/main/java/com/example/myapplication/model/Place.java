package com.example.myapplication.model;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;

public class Place {
    public static final List<Place> FAKE_PLACES = Arrays.asList(
            new Place(1, "Bitcoin"),
            new Place(2, "Eth"),
            new Place(3, "Dash"),
            new Place(4, "Aave"),
            new Place(5, "XRP"),
            new Place(6, "LINK"),
            new Place(7, "Orion"),
            new Place(8, "Polkadot"),
            new Place(9, "LTC"),
            new Place(10, "BNB")
    );
    private final Integer id;
    private final String Name;

    public Place(int id, String Name) {

        this.id = id;
        this.Name = Name;
    }

}

package com.example.myapplication.service;

import androidx.room.Room;

import com.example.myapplication.model.Place;

import java.util.Arrays;
import java.util.List;

public abstract class DummyFakeApiRoomGenerator {

    public static final Room[] getRoom() {
        new Place(1, "Bitcoin"),
                new Place(2, "Eth"),
                new Place(3, "Dash"),
                new Place(4, "Aave"),
                new Place(5, "XRP"),
                new Place(6, "LINK"),
                new Place(7, "Orion"),
                new Place(8, "Polkadot"),
                new Place(9, "LTC"),
                new Place(10, "BNB"),

                return new room[] {};
    };
}


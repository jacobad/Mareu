package com.example.myapplication.service;

import com.example.myapplication.model.Room;

import java.util.Arrays;
import java.util.List;

public abstract class DummyFakeApiRoomGenerator {

    public static final List<Room> ROOM_PLACE = Arrays.asList(
        new Room(1, "Bitcoin"),
                new Room(2, "Eth"),
                new Room(3, "Dash"),
                new Room(4, "Aave"),
                new Room(5, "XRP"),
                new Room(6, "LINK"),
                new Room(7, "Orion"),
                new Room(8, "Polkadot"),
                new Room(9, "LTC"),
                new Room(10, "BNB")

            );
}


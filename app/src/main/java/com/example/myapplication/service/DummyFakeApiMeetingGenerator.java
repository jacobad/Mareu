package com.example.myapplication.service;

import com.example.myapplication.model.Meeting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public abstract class DummyFakeApiMeetingGenerator {

    public static final List USERS = List.of("test","test2","test3");


    public static List<Meeting> FAKE_MEETINGS = Arrays.asList(
            new Meeting(1, (new Date()).getTime(), 1, "neige", USERS ),
            new Meeting(2, (new Date()).getTime(), 2, "neige", USERS),
            new Meeting(3, (new Date()).getTime(),3, "neige", USERS),
            new Meeting(4, (new Date()).getTime(), 4, "neige", USERS),
            new Meeting(5, (new Date()).getTime(),5, "neige", USERS),
            new Meeting(6, (new Date()).getTime(),6, "neige",USERS),
            new Meeting(7, (new Date()).getTime(), 7, "neige", USERS),
            new Meeting(8, (new Date()).getTime(),8, "neige", USERS),
            new Meeting(9, (new Date()).getTime(), 9, "neige", USERS),
            new Meeting(10, (new Date()).getTime(), 10, "neige", USERS)
    );
    static List<Meeting> generateMeetings() {
        return new ArrayList<>(FAKE_MEETINGS);
    }
}

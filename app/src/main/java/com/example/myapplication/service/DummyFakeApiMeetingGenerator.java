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




    public static List<Meeting> FAKE_MEETINGS = Arrays.asList(
            new Meeting(1, (new Date()).getTime(), 1, "neige", "USERS",0xFF5E85F ),
            new Meeting(2, (new Date()).getTime(), 2, "neige", "USERS",0xFF5E85F),
            new Meeting(3, (new Date()).getTime(),3, "neige", "USERS",0xFF5E85),
            new Meeting(4, (new Date()).getTime(), 4, "neige", "USERS",0xFF5E855F),
            new Meeting(5, (new Date()).getTime(),5, "neige", "USERS",0xFF5E85),
            new Meeting(6, (new Date()).getTime(),6, "neige","USERS",0xFF5E855F),
            new Meeting(7, (new Date()).getTime(), 7, "neige", "USERS",0xFF855F),
            new Meeting(8, (new Date()).getTime(),8, "neige", "USERS",0xFF5E855F),
            new Meeting(9, (new Date()).getTime(), 9, "neige", "USERS",0xFF5E855F),
            new Meeting(10, (new Date()).getTime(), 10, "neige", "USERS",0xFF5E855F)
    );
    static List<Meeting> generateMeetings() {
        return new ArrayList<>(FAKE_MEETINGS);
    }
}

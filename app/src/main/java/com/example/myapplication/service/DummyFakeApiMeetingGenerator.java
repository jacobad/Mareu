package com.example.myapplication.service;

import com.example.myapplication.model.Meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class DummyFakeApiMeetingGenerator {

    public static List<Meeting> FAKE_MEETINGS = Arrays.asList(
            new Meeting(1, (new Date()).getTime(), 1, "neige", "Réunion A"),
            new Meeting(2, (new Date()).getTime(), 2, "neige", "Réunion B"),
            new Meeting(3, (new Date()).getTime(),3, "neige", "Réunion C"),
            new Meeting(4, (new Date()).getTime(), 4, "neige", "Réunion D"),
            new Meeting(5, (new Date()).getTime(),5, "neige", "Réunion E"),
            new Meeting(6, (new Date()).getTime(),6, "neige", "Réunion F"),
            new Meeting(7, (new Date()).getTime(), 7, "neige", "Réunion G"),
            new Meeting(8, (new Date()).getTime(),8, "neige", "Réunion H"),
            new Meeting(9, (new Date()).getTime(), 9, "neige", "Réunion I"),
            new Meeting(10, (new Date()).getTime(), 10, "neige", "Réunion J")
    );
    static List<Meeting> generateMeetings() {
        return new ArrayList<>(FAKE_MEETINGS);
    }
}

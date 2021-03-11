package com.example.myapplication.service;

import com.example.myapplication.model.Meeting;

import java.util.List;

public class DummyMettingApi implements MeetingApiService{



    @Override
    public List<Meeting> getMeetingList() {
        return null;
    }

    @Override
    public void addMeeting(Meeting meeting) {

    }

    @Override
    public void deleteMeeting(Meeting meeting) {

    }
}

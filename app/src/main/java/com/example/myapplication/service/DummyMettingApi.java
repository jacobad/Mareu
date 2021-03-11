package com.example.myapplication.service;

import com.example.myapplication.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class DummyMettingApi implements MeetingApiService{
    private List<Meeting> meetings = new ArrayList<>();
      private List<Meeting> mMeetings;
      private  List<String> mRooms;


    public DummyMettingApi() {
        mMeetings = new ArrayList<>();

    }
    @Override
    public List<Meeting> getMeetingList() {
        return meetings;
    }

    @Override
    public void addMeeting(Meeting meeting) {
            meetings.add(meeting);
    }

    @Override
    public void deleteMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    @Override
    public Meeting getMeetingByID(int id) {
        return null;
    }
}

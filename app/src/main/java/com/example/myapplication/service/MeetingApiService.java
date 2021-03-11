package com.example.myapplication.service;

import com.example.myapplication.model.Meeting;

import java.util.List;

public interface MeetingApiService {

    List<Meeting> getMeetingList();

    void addMeeting(Meeting meeting);

    void deleteMeeting(Meeting meeting);
}

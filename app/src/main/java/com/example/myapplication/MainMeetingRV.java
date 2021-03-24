package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainMeetingRV extends Activity {

    private RecyclerView mRecylerView;
    private MeetingAdapter monAdapater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_meeting_rv);

        mRecylerView = (RecyclerView)findViewById(R.id.RecyclerView);

        mRecylerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecylerView.setAdapter(monAdapater);
    }


}

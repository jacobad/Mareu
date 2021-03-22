package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class MainMeetingRV extends Activity {

    private RecyclerView mRecylerView;
    private MyMeetingAdapter monAdapater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_meeting_rv);

        mRecylerView = (RecyclerView)findViewById(R.id.RecyclerView);




        mRecylerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecylerView.setAdapter(monAdapater);
    }


}

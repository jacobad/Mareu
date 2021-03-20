package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.service.DummyFakeApiRoomGenerator;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class meetingFragment extends Fragment {


    private Spinner spinnerRoom;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_meeting);
        this.spinnerRoom = (Spinner)findViewById(R.id.spinner_room);

        Room[] room = DummyFakeApiRoomGenerator.getRoom();

        ArrayAdapter<room>adapter = new ArrayAdapter<room>(this,
                android.R.layout.simple_spinner_item,
                room);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinnerRoom.setAdapter(adapter);

        this.spinnerRoom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                onItemSelectedHandler(parent, view, position, id);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void onItemSelectedHandler(AdapterView<?> parent, View view, int position, long id) {
        Adapter adapter = adapterView.getAdapter();
        Room room = (Room) adapter.getItem(position);

        Toast.makeText(getApplicationContext(), "Selected room: " ,Toast.LENGTH_SHORT).show();

    }


    private void setContentView(int fragment_meeting) {
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.model.Meeting;
import com.example.myapplication.model.Place;
import com.example.myapplication.service.DummyFakeApiRoomGenerator;
import com.example.myapplication.view.PlaceArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import static android.R.layout.simple_spinner_item;


public class meetingFragment extends Fragment {


    private Spinner spinnerRoom;



    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_meeting, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        spinnerRoom = view.findViewById(R.id.spinner_room);


        Place[] rooms = (Place[]) DummyFakeApiRoomGenerator.ROOM_PLACE.toArray();

        ArrayAdapter<Place>adapter = new PlaceArrayAdapter(getActivity(),simple_spinner_item,rooms);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRoom.setAdapter(adapter);

        spinnerRoom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                onItemSelectedHandler(parent, view, position, id);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        view.findViewById(R.id.Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });




    }

    private void onItemSelectedHandler(AdapterView<?> adapterView, View view, int position, long id) {
        Adapter adapter = adapterView.getAdapter();
        Place place = (Place) adapter.getItem(position);

        Toast.makeText(getContext(), "Selected room: " ,Toast.LENGTH_SHORT).show();

    }


    /*Intent intent = new Intent(Meeting.this, meetingFragment.class);
                intent.putExtra(SPINNER_LIST, "users");
               context.startActivity(profileActivity);*/



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
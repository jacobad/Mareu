package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.model.Meeting;
import com.example.myapplication.service.MeetingApiService;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Date;

public class MeetingActivity extends AppCompatActivity {



    private MeetingApiService mApiService;
    private Meeting meeting;
    private TextInputEditText mNameInput;
    private TextInputEditText mTime;
    private TextInputEditText mDate;
    private TextInputEditText mUser;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameInput = (TextInputEditText) findViewById(R.id.name_input);
        mDate = (TextInputEditText)findViewById(R.id.date_input);
        mTime = (TextInputEditText)findViewById(R.id.time_input);
        mUser = (TextInputEditText)findViewById(R.id.User_input);
        mButton =(Button)findViewById(R.id.Button);

        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mButton.setEnabled(s.toString().length()!= 0);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
};






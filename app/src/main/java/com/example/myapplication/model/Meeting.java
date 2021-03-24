package com.example.myapplication.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

import com.example.myapplication.meetingFragment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.example.myapplication.service.DummyFakeApiMeetingGenerator.FAKE_MEETINGS;


public class Meeting implements Parcelable {

    /**
     * Meet Id
     */
    private int id;

    /**
     * Meeting Date
     */
    private Long date;

    /**
     * Meeting Room
     */
    private int placeId;

    /**
     * Meeting Subject
     */
    private String subject;

    /**
     * Meeting User List
     */
    private String users;


    /**
     * Meeting User List
     */

    private Integer avatar;





    public Meeting(int id, Long date, int placeId, String subject, String users, Integer avatar) {
        this.id = id;
        this.date = date;
        this.placeId = placeId;
        this.subject = subject;
        this.users = users ;
        this.avatar = avatar;
    }
    public Integer getId() {
        return id;
    }

    public int getPlaceId() {return placeId ;}

    public String getSubject() {return subject;}

    public String getUsers() {return users;}

    public Integer getAvatar() { return avatar = avatar;}




    protected Meeting(Parcel in) {
        id = in.readInt();
        if (in.readByte() == 0) {
            date = null;
        } else {
            date = in.readLong();
        }
        placeId = in.readInt();
        subject = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        if (date == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(date);
        }
        dest.writeInt(placeId);
        dest.writeString(subject);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Meeting> CREATOR = new Creator<Meeting>() {
        @Override
        public Meeting createFromParcel(Parcel in) {
            return new Meeting(in);
        }

        @Override
        public Meeting[] newArray(int size) {
            return new Meeting[size];
        }
    };
}

package com.example.myapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Calendar;
import java.util.Date;

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
     * Meeting Place
     */
    private int placeId;

    /**
     * Meeting Subject
     */
    private String subject;

    /**
     * Meeting User List
     */
    private String user;

     /* public getUserText{
        for (user user : meeting[FAKE_MEETINGS])
           (int user=0; user<meeting[FAKE_MEETINGS].size(); user++)
            return(meeting[FAKE_MEETINGS].get(user));
    }*/


    public Meeting(int id, Long date, int placeId, String subject, String user) {
        this.id = id;
        this.date = date;
        this.placeId = placeId;
        this.subject = subject;
        this.user = user;
    }

    protected Meeting(Parcel in) {
        id = in.readInt();
        if (in.readByte() == 0) {
            date = null;
        } else {
            date = in.readLong();
        }
        placeId = in.readInt();
        subject = in.readString();
        user = in.readString();
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
        dest.writeString(user);
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

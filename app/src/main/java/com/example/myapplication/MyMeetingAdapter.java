package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Meeting;

import java.util.List;

public class MyMeetingAdapter extends RecyclerView.Adapter<MyMeetingAdapter.MyViewHolder>  {

    List<Meeting> myMeeting;

    MyMeetingAdapter(List<Meeting>myMeeting) {this.myMeeting = myMeeting; }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.meeting_item,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.display(myMeeting.get(position));
    }
    public int getItemCount(){
        return myMeeting.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView mAvatar;
       // private Spinner mRoom;
        private TextView mTime;
        private TextView mDate;
        private TextView mUser;
        private TextView mSubject;


        MyViewHolder(View itemView){
            super(itemView);

            mSubject = (TextView)itemView.findViewById(R.id.item_list_meeting_subtitle);
            mTime =(TextView)itemView.findViewById(R.id.item_list_meeting_time);
            mAvatar =(ImageView)itemView.findViewById(R.id.meeting_avatar);
            mUser =(TextView)itemView.findViewById(R.id.item_list_meeting_title);
            mDate =(TextView)itemView.findViewById(R.id.item_date_input);
           // mRoom =(Spinner)itemView.findViewById(R.id.);
        }
        void display(Meeting Meeting){
        }
    }

}

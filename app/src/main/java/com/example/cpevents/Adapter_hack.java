package com.example.cpevents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Adapter_hack extends ArrayAdapter<Items_hack> {
    ArrayList<Items_hack> coding_events;
    public Adapter_hack(@NonNull Context context, int resource, @NonNull ArrayList<Items_hack> items) {
        super(context, resource, items);
        coding_events = items;


    }
    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_hack,parent,false
            );
        }
        Items_hack item=getItem(position);

        // LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //v = inflater.inflate(R.layout.list_view_items, null);
        TextView host_url=listItemView.findViewById(R.id.hosturl);
        TextView host_name =listItemView.findViewById(R.id.hostname);
        TextView cont_url=listItemView.findViewById(R.id.contesturl);
        TextView cont_name= listItemView.findViewById(R.id.contestname);
        TextView duration = listItemView.findViewById(R.id.duration);
        TextView end_date=listItemView.findViewById(R.id.end);
        TextView start_date=listItemView.findViewById(R.id.start);
        TextView location =listItemView.findViewById(R.id.location);
        host_url.setText("Host_url : "+item.getHosturl());
        host_name.setText("Host_Name : "+item.getHostname());
        cont_url.setText("Contest_url : "+item.getContesturl());
        cont_name.setText("Contest_Name : "+item.getContestname());
        duration.setText("Duration : "+item.getDuration());
        end_date.setText("End_date : "+item.getEnd_date());
        start_date.setText("start_date : "+item.getStart_date());
        location.setText("Location : "+item.getLocation());
        return listItemView;

    }

}

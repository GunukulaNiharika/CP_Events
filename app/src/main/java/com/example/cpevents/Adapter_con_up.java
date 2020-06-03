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

public class Adapter_con_up extends ArrayAdapter<Items> {
    ArrayList<Items> coding_events;

    public Adapter_con_up(@NonNull Context context, int resource, @NonNull ArrayList<Items> items) {
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
                    R.layout.custom_cont_up,parent,false
            );
        }
        Items item=getItem(position);

        // LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //v = inflater.inflate(R.layout.list_view_items, null);
        TextView host_url=listItemView.findViewById(R.id.hosturl);
        TextView host_name =listItemView.findViewById(R.id.hostname);
        TextView cont_url=listItemView.findViewById(R.id.contesturl);
        TextView cont_name= listItemView.findViewById(R.id.contestname);
        TextView duration = listItemView.findViewById(R.id.duration);
        TextView end=listItemView.findViewById(R.id.end);
        host_url.setText("Host_url : "+item.getHosturl());
        host_name.setText("Host_Name : "+item.getHostname());
        cont_url.setText("Contest_url : "+item.getContesturl());
        cont_name.setText("Contest_Name : "+item.getContestname());
        duration.setText("Duration : "+item.getDuration());
        end.setText("Start : "+item.getEnd());
        return listItemView;

    }

}

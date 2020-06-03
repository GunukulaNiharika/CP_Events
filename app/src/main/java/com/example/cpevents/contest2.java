package com.example.cpevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class contest2 extends AppCompatActivity {
    ListView listView1;
    ArrayList<Items> list1=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1=findViewById(R.id.simplelistview);
        final Adapter_con_up adapter=new Adapter_con_up(this,R.layout.custom_cont_up,list1);
        listView1.setAdapter(adapter);
        TextView toolbar=findViewById(R.id.tooltitle);
        toolbar.setText("CONTESTS-UPCOMING");


      AsyncHttpClient asyncHttpClient=new AsyncHttpClient();
      asyncHttpClient.get("http://testchallengehunt.appspot.com/v1/all",new JsonHttpResponseHandler(){
          @Override
          public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
              try {
                  JSONObject c2obj=response.getJSONObject("contests");
                  String c2up=c2obj.getString("upcoming");
                  JSONArray upcoming=new JSONArray(c2up);
                  for(int j=0;j<upcoming.length();j++){
                      JSONObject c2objup=upcoming.getJSONObject(j);
                      list1.add(new Items(c2objup.getString("host_url"),
                              c2objup.getString("host_name"),
                              c2objup.getString("contest_url"),
                              c2objup.getString("contest_name"),
                              c2objup.getString("duration"),
                              c2objup.getString("start")));
                  }

              }
              catch (Exception e){
                  e.printStackTrace();
              }
              adapter.notifyDataSetChanged();
          }

      });

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                AsyncHttpClient client1=new AsyncHttpClient();
                client1.get("http://testchallengehunt.appspot.com/v1/all",new JsonHttpResponseHandler(){

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response1) {
                        super.onSuccess(statusCode, headers, response1);
                        try {
                            JSONObject con = response1.getJSONObject("contests");
                            String conobj = con.getString("upcoming");
                            JSONArray act = new JSONArray(conobj);
                            for (int i = 0; i < act.length(); i++) {
                                JSONObject obj = act.getJSONObject(i);
                                if(i==position){
                                    String url= obj.getString("contest_url");
                                    Intent intent=new Intent(contest2.this,Cont_url.class);
                                    intent.putExtra("url",url);

                                    startActivity(intent);
                                }
                            }
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                });
            }
        });

    }
}

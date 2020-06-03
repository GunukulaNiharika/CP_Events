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

public class contest1 extends AppCompatActivity {
ListView listView;

ArrayList<Items> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.simplelistview);
        TextView toolbar=findViewById(R.id.tooltitle);
        toolbar.setText("CONTESTS-ACTIVE");
       // list.add(new Items("rr","faf,","ddfd","dsdfd","fdsfd","fsf"));
   // String JSON_string="{\"contests\": {\"active\": [{\"end\": \"2020-03-31T16:00:00\", \"contest_name\": \"US Open\", \"host_url\": \"http://usaco.org\", \"host_name\": \"usaco.org\", \"duration\": \"04:00\", \"contest_url\": \"http://usaco.org/\"}, {\"end\": \"2020-04-03T17:00:00\", \"contest_name\": \"Palladium 2020\", \"host_url\": \"http://codility.com\", \"host_name\": \"codility.com\", \"duration\": \"42 days\", \"contest_url\": \"https://app.codility.com/programmers/challenges/palladium2020/\"}, {\"end\": \"2020-04-05T02:00:00\", \"contest_name\": \"Code Jam Registration Open\", \"host_url\": \"http://codingcompetitions.withgoogle.com\", \"host_name\": \"codingcompetitions.withgoogle.com\", \"duration\": \"32 days\", \"contest_url\": \"https://codingcompetitions.withgoogle.com/\"}, {\"end\": \"2020-04-05T18:25:00\", \"contest_name\": \"realme PaySa UPI Hackathon\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"20 days\", \"contest_url\": \"https://www.hackerearth.com/challenges/hackathon/realme-paysa-hackathon/\"}, {\"end\": \"2020-04-05T18:25:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"6 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-05T18:25:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"20 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-05T18:25:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"9 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-06T20:59:00\", \"contest_name\": \"BSUIR Open X. Qualification\", \"host_url\": \"http://acm.bsuir.by\", \"host_name\": \"acm.bsuir.by\", \"duration\": \"16 days\", \"contest_url\": \"https://official.contest.yandex.ru/bsuir2020/contest/17436/enter/?lang=en\"}, {\"end\": \"2020-04-07T02:00:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"44 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-09T20:45:00\", \"contest_name\": \"Graph representation\", \"host_url\": \"http://e-olymp.com\", \"host_name\": \"e-olymp.com\", \"duration\": \"19 days\", \"contest_url\": \"https://www.e-olymp.com/en/contests/15927\"}, {\"end\": \"2020-04-14T00:00:00\", \"contest_name\": \"Rodeo II Sprint: Sub-Seasonal Climate Forecasting - temp56 Task, period #14\", \"host_url\": \"http://topcoder.com\", \"host_name\": \"topcoder.com\", \"duration\": \"14 days\", \"contest_url\": \"https://topcoder.com/challenges/30121377\"}, {\"end\": \"2020-04-14T00:00:00\", \"contest_name\": \"\", \"host_url\": \"http://topcoder.com\", \"host_name\": \"topcoder.com\", \"duration\": \"14 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-14T00:00:00\", \"contest_name\": \"\", \"host_url\": \"http://topcoder.com\", \"host_name\": \"topcoder.com\", \"duration\": \"14 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-14T00:00:00\", \"contest_name\": \"\", \"host_url\": \"http://topcoder.com\", \"host_name\": \"topcoder.com\", \"duration\": \"14 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-14T18:30:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"30 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-20T17:00:00\", \"contest_name\": \"Ocean of Code\", \"host_url\": \"http://codingame.com\", \"host_name\": \"codingame.com\", \"duration\": \"31 days\", \"contest_url\": \"http://www.codingame.com/contests/ocean-of-code\"}, {\"end\": \"2020-04-23T02:00:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"30 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-23T18:25:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"31 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-04-26T21:00:00\", \"contest_name\": \"RuCode Festival\", \"host_url\": \"http://rucode.net\", \"host_name\": \"rucode.net\", \"duration\": \"56 days\", \"contest_url\": \"https://rucode.net/\"}, {\"end\": \"2020-04-30T14:00:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"53 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-05-01T02:00:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"45 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-05-01T13:59:00\", \"contest_name\": \"\", \"host_url\": \"http://topcoder.com\", \"host_name\": \"topcoder.com\", \"duration\": \"66 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-05-03T18:25:00\", \"contest_name\": \"\", \"host_url\": \"http://hackerearth.com\", \"host_name\": \"hackerearth.com\", \"duration\": \"34 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-06-19T19:30:00\", \"contest_name\": \"ngoctuan_contests\", \"host_url\": \"http://spoj.com\", \"host_name\": \"spoj.com\", \"duration\": \"3 years\", \"contest_url\": \"http://www.spoj.com/ISTCLNGE/\"}, {\"end\": \"2020-06-27T00:00:00\", \"contest_name\": \"Statue of Liberty\", \"host_url\": \"http://azspcs.net\", \"host_name\": \"azspcs.net\", \"duration\": \"90 days\", \"contest_url\": \"http://www.azspcs.net/\"}, {\"end\": \"2020-06-27T15:00:00\", \"contest_name\": \"\", \"host_url\": \"http://azspcs.net\", \"host_name\": \"azspcs.net\", \"duration\": \"91 days\", \"contest_url\": \"#\"}, {\"end\": \"2020-06-27T18:30:00\", \"contest_name\": \"DSA Learning Series\", \"host_url\": \"http://codechef.com\", \"host_name\": \"codechef.com\", \"duration\": \"90 days\", \"contest_url\": \"http://www.codechef.com/LEARNDSA?itm_campaign=contest_listing\"}, {\"end\": \"2020-09-30T02:30:00\", \"contest_name\": \"\", \"host_url\": \"http://spoj.com\", \"host_name\": \"spoj.com\", \"duration\": \"4 years\", \"contest_url\": \"#\"}, {\"end\": \"2020-10-30T18:30:00\", \"contest_name\": \"\", \"host_url\": \"http://codechef.com\", \"host_name\": \"codechef.com\", \"duration\": \"5 years\", \"contest_url\": \"#\"}, {\"end\": \"2021-01-01T00:00:00\", \"contest_name\": \"\", \"host_url\": \"http://spoj.com\", \"host_name\": \"spoj.com\", \"duration\": \"731 days\", \"contest_url\": \"#\"}, {\"end\": \"2021-03-08T10:15:00\", \"contest_name\": \"\", \"host_url\": \"http://e-olymp.com\", \"host_name\": \"e-olymp.com\", \"duration\": \"365 days\", \"contest_url\": \"#\"}]}}";
        final Adapter_act adapter=new Adapter_act(this,R.layout.customlist,list);
        listView.setAdapter(adapter);
        AsyncHttpClient client=new AsyncHttpClient();
        client.get("http://testchallengehunt.appspot.com/v1/all",new JsonHttpResponseHandler()
        {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try {
                   // JSONObject object=new JSONObject(response);
                    JSONObject contests1=response.getJSONObject("contests");
                    String c1jsonobj=contests1.getString("active");
                    JSONArray cactive=new JSONArray(c1jsonobj);
                    for(int i=0;i<cactive.length();i++){
                        JSONObject cobjactive=cactive.getJSONObject(i);
                        list.add(new Items(cobjactive.getString("host_url"),
                               cobjactive.getString("host_name"),
                                cobjactive.getString("contest_url"),
                                cobjactive.getString("contest_name"),
                                cobjactive.getString("duration"),
                                cobjactive.getString("end")));
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
                adapter.notifyDataSetChanged();
            }
        });

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
             AsyncHttpClient client1=new AsyncHttpClient();
             client1.get("http://testchallengehunt.appspot.com/v1/all",new JsonHttpResponseHandler(){

                 @Override
                 public void onSuccess(int statusCode, Header[] headers, JSONObject response1) {
                     super.onSuccess(statusCode, headers, response1);
                     try {
                         JSONObject con = response1.getJSONObject("contests");
                         String conobj = con.getString("active");
                         JSONArray act = new JSONArray(conobj);
                         for (int i = 0; i < act.length(); i++) {
                             JSONObject obj = act.getJSONObject(i);
                             if(i==position){
                                String url= obj.getString("contest_url");
                                 Intent intent=new Intent(contest1.this,Cont_url.class);
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

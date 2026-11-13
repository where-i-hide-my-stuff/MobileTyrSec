package com.example.mobiletyrsec;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class sqliteupdatelist extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqliteupdatelist);

        final myDBClass3 myDb = new myDBClass3(this);
        final ArrayList<HashMap<String, String>> MebmerList = myDb.SelectAllData();

        // listView1
        ListView lisView1 = (ListView)findViewById(R.id.listView1);

        SimpleAdapter sAdap;
        sAdap = new SimpleAdapter(sqliteupdatelist.this, MebmerList, R.layout.activity_column2,
                new String[] {"MemberID", "Name", "Tel"}, new int[] {R.id.ColMemberID, R.id.ColName, R.id.ColTel});
        lisView1.setAdapter(sAdap);

        lisView1.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int position, long mylng) {

                // Show on new activity
                Intent newActivity = new Intent(sqliteupdatelist.this,UpdateActivity.class);
                newActivity.putExtra("MemID", MebmerList.get(position).get("MemberID").toString());
                startActivity(newActivity);

            }
        });


        // btnCancel (Cancel)
        final Button cancel = (Button) findViewById(R.id.btnCancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open Form Main
                Intent newActivity = new Intent(sqliteupdatelist.this,tabhostt.class);
                startActivity(newActivity);
            }
        });

    }


}
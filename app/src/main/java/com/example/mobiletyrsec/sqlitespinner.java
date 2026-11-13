package com.example.mobiletyrsec;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.app.Activity;
import android.database.Cursor;
import android.widget.Toast;


public class sqlitespinner extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlitespinner);

        // get Data from SQLite
        final myDBClass2 myDb = new myDBClass2(this);



        final Cursor myData = myDb.SelectAllData();
        startManagingCursor(myData);

        // spinner1
        final Spinner spin = (Spinner)findViewById(R.id.spinner1);

        String[] cols = new String[]{"Name"};
        int[] names = new int[]{android.R.id.text1};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1 , myData ,cols,names);

        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View selectedItemView,
                                       int position, long id) {
                // TODO Auto-generated method stub
                String ItemID = myData.getString(myData.getColumnIndex("Name"));
                Toast.makeText(sqlitespinner.this,
                        "Your Selected : " + ItemID,
                        Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(sqlitespinner.this,
                        "Your Selected : -",
                        Toast.LENGTH_SHORT).show();
            }


        });

    }




}
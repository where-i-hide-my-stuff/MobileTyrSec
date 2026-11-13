package com.example.mobiletyrsec;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class tabhostt extends TabActivity {

    private TabHost tbh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhostt);

        tbh = getTabHost();

        TabSpec ts1 = tbh.newTabSpec("page1");
        ts1.setIndicator("Main Activity");
        ts1.setContent(new Intent(this, MainActivity.class));
        tbh.addTab(ts1);

        TabSpec ts2 = tbh.newTabSpec("page2");
        ts2.setIndicator("Sqlite Insert");
        ts2.setContent(new Intent(this, sqliteinsert.class));
        tbh.addTab(ts2);

        TabSpec ts3 = tbh.newTabSpec("page3");
        ts3.setIndicator("Sqlite Update");
        ts3.setContent(new Intent(this, sqliteupdatelist.class));
        tbh.addTab(ts3);

        TabSpec ts4 = tbh.newTabSpec("page4");
        ts4.setIndicator("Sqlite Delete");
        ts4.setContent(new Intent(this, sqlitedeletelist.class));
        tbh.addTab(ts4);

        TabSpec ts5 = tbh.newTabSpec("page4");
        ts5.setIndicator("Sqlite spinner");
        ts5.setContent(new Intent(this, sqlitespinner.class));
        tbh.addTab(ts5);







    }



}

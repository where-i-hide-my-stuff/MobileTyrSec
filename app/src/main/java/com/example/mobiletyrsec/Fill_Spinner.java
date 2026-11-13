package com.example.mobiletyrsec;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Fill_Spinner extends AppCompatActivity {
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fill_spinner);
     sp=(Spinner)findViewById(R.id.spcountry);
     addItems();
    }

    private void addItems() {
        List<String> list=new ArrayList<String>();
        list.add("Lebanon");
        list.add("USA");
        list.add("Canada");
        list.add("France");
        list.add("Beirut");
        list.add("Syrian");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Fill_Spinner.this,
                android.R.layout.simple_spinner_item,list);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
    }
}
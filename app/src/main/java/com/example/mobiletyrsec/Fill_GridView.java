package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Fill_GridView extends AppCompatActivity {
GridView gv;
String[] myData=new String[]{
        "Data1","Data2","Data3","Data4",
        "Data1","Data2","Data3","Data4",
        "Data1","Data2","Data3","Data4",
        "Data1","Data2","Data3","Data4",
        "Data1","Data2","Data3","Data4",
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fill_grid_view);
    gv=(GridView) findViewById(R.id.grdview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(Fill_GridView.this,
                android.R.layout.simple_list_item_1,myData) ;
        gv .setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected=(String)((TextView)view).getText();
                Toast.makeText(Fill_GridView.this,"Data="+selected,Toast.LENGTH_LONG).show();


            }
        });
    }
}
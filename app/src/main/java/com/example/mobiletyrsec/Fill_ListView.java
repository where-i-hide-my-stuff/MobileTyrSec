package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Fill_ListView extends AppCompatActivity {
ListView lst;
public String[] phoneNo=new String[]{"76158589","0312345","81766992",
"79654378","81245639","76239856"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fill_list_view);
      lst=(ListView)findViewById(R.id.lstview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Fill_ListView.this,
                android.R.layout.simple_list_item_1,phoneNo);
        lst.setAdapter(adapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected=(String)((TextView)view).getText();
                Toast.makeText(Fill_ListView.this,"Phone Number="+selected,Toast.LENGTH_LONG).show();
           Bundle b=new Bundle();
           b.putString("r",selected);
           Intent k=new Intent(Fill_ListView.this, Lst_Chating.class);
           k.putExtras(b);
           startActivity(k);

            }
        });
    }
}
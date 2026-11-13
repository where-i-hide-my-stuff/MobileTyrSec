package com.example.mobiletyrsec;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class ListView_Items extends AppCompatActivity {
ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_items);
     lst=(ListView) findViewById(R.id.lstviewitems);
        ArrayList<HashMap<String,String>>myarraylist=new ArrayList<HashMap<String,String>>();
        HashMap<String,String>map;
        //Row 1
        map=new HashMap<String,String>();
        map.put("MemberId","1");
        map.put("Name","Khaled");
        map.put("Tel","76123456");
        myarraylist.add(map);
        //Row 2
        map=new HashMap<String,String>();
        map.put("MemberId","2");
        map.put("Name","Salim");
        map.put("Tel","03125678");
        myarraylist.add(map);
        //Row 3
        map=new HashMap<String,String>();
        map.put("MemberId","3");
        map.put("Name","Hussein");
        map.put("Tel","81766992");
        myarraylist.add(map);
        //Row 4
        map=new HashMap<String,String>();
        map.put("MemberId","4");
        map.put("Name","Ali");
        map.put("Tel","8712398");
        myarraylist.add(map);
        SimpleAdapter adpater=new SimpleAdapter(ListView_Items.this,myarraylist,R.layout.activity_column,
                new String[]{"MemberId","Name","Tel"},
                new int[]{R.id.ColMemberID,R.id.ColName,R.id.ColTel});
        lst.setAdapter(adpater);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String pos=myarraylist.get(position).get("Tel");
                Toast.makeText(ListView_Items.this,"Value="+pos,Toast.LENGTH_LONG).show();
            }
        });
    }
    }

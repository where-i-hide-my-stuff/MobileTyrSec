package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bundle2 extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bundle2);
       txt=(TextView) findViewById(R.id.txtmonitor);
       Intent s=getIntent();
       String name=s.getStringExtra("r");
       String phone=s.getStringExtra("k");
       txt.setText("Result="+name+","+phone);
    }
}
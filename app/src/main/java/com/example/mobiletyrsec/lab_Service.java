package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class lab_Service extends AppCompatActivity {
Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab_service);
    start=(Button)findViewById(R.id.btnStart);
    stop=(Button)findViewById(R.id.btnStop);
    start.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(lab_Service.this,MyService.class);
       startService(i);
        }
    });
    stop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(lab_Service.this,MyService.class);
            stopService(i);
        }
    });
    }
}
package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Lst_Chating extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lst_chating);
       txt=(TextView)findViewById(R.id.txtchat);
       Intent l=getIntent();
       String phoneNumber=l.getStringExtra("r");
       txt.setText(phoneNumber);
    }
}
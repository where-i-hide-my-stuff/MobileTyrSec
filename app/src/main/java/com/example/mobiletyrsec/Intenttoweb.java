package com.example.mobiletyrsec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intenttoweb extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intenttoweb);
     btn=(Button)findViewById(R.id.btngotowebb);
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(Intent.ACTION_VIEW);
             i.setData(Uri.parse("http://www.google.com"));
             startActivity(i);
         }
     });

    }
}
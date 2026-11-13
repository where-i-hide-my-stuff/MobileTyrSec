package com.example.mobiletyrsec;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Traffic_Light extends AppCompatActivity {
TextView txt;
RadioButton rb1,rb2,rb3;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_traffic_light);
       txt=(TextView) findViewById(R.id.txtStatus);
       rb1=(RadioButton) findViewById(R.id.rbgreen);
       rb2=(RadioButton) findViewById(R.id.rborange);
       rb3=(RadioButton) findViewById(R.id.rbred);
       btn=(Button)findViewById(R.id.btnchangelight);
       String strColor=getResources().getString(R.color.orange);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(rb1.isChecked()){
                   txt.setTextColor(Color.GREEN);
                   txt.setText("Gooo");
                   txt.setTextSize(50);
               }
               if(rb2.isChecked()){
                   txt.setTextColor(Color.parseColor(strColor));
                   txt.setText("Ready");
                   txt.setTextSize(50);
               }
               if(rb3.isChecked()){
                   txt.setTextColor(Color.RED);
                   txt.setText("Stop");
                   txt.setTextSize(50);
               }

           }
       });
    };
}
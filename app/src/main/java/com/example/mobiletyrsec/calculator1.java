package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculator1 extends AppCompatActivity {
EditText edt,edt1;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator1);
       edt=(EditText) findViewById(R.id.edtnumber1);
       edt1=(EditText) findViewById(R.id.edtnumber2);
       btn=(Button)findViewById(R.id.btncalculate);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Bundle b=new Bundle();
               b.putString("r",edt.getText().toString());

               Bundle c=new Bundle();
               c.putString("f",edt1.getText().toString());
               Intent i=new Intent(calculator1.this,calculator2.class);
               i.putExtras(b);
               i.putExtras(c);
               startActivity(i);
           }
       });
    }
}
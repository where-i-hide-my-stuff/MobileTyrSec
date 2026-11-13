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

public class Bundle1 extends AppCompatActivity {
EditText edt1,edt2;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bundle1);
       edt1=(EditText) findViewById(R.id.edtname);
       edt2=(EditText) findViewById(R.id.edtphone);
       btn=(Button)findViewById(R.id.btnbundle);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Bundle a=new Bundle();
               a.putString("r",edt1.getText().toString());

               Bundle b=new Bundle();
               b.putString("k",edt2.getText().toString());

               Intent k=new Intent(Bundle1.this,Bundle2.class);
               k.putExtras(a);
               k.putExtras(b);
               startActivity(k);
           }
       });
    }
}
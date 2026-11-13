package com.example.mobiletyrsec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntentCall extends AppCompatActivity {
EditText edt;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent_call);
     edt=(EditText) findViewById(R.id.edtnumber);
     btn=(Button)findViewById(R.id.btncall);
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String number=edt.getText().toString();
             Intent i=new Intent(Intent.ACTION_CALL);
              i.setData(Uri.parse("tel:"+number));
              startActivity(i);
         }
     });
    }
}
package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intenttocontact extends AppCompatActivity {
Button btn;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intenttocontact);
       btn=(Button)findViewById(R.id.btngotocontactt);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent k=new Intent();
               k.setAction(Intent.ACTION_VIEW);
               k.setData(ContactsContract.Contacts.CONTENT_URI);
               startActivity(k);
           }
       });
    }
}
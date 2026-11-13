package com.example.mobiletyrsec;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Alert_Xml extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_xml);
     btn=(Button)findViewById(R.id.btnalertxml);
        AlertDialog.Builder popDialog=new AlertDialog.Builder(Alert_Xml.this);
        LayoutInflater inflator=(LayoutInflater)
        this.getSystemService(LAYOUT_INFLATER_SERVICE)  ;
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             View layout=inflator.inflate(R.layout.layout_popup,
                     (ViewGroup) findViewById(R.id.layout_pop));
             popDialog.setIcon(android.R.drawable.btn_star_big_on) ;
             popDialog.setTitle("Pop Up Details!");
             popDialog.setMessage("Inflate XML Into Dialog!");
             popDialog.setView(layout);
             popDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.dismiss();
                 }
             });
             popDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.cancel();
                 }
             });
             popDialog.create();
             popDialog.show();
         }
     });
    }
}
package com.example.mobiletyrsec;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Alert_Dialog extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_dialog);
      btn=(Button)findViewById(R.id.btnAlert);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              AlertDialog.Builder builder=new AlertDialog.Builder(Alert_Dialog.this);
              builder.setIcon(android.R.drawable.star_big_on);
              builder.setTitle("Log Out Dialog");
              builder.setCancelable(false);
              builder.setMessage("Are you sure you want to exit");
              builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      dialogInterface.dismiss();
                      Toast.makeText(Alert_Dialog.this,"You Click Yes",Toast.LENGTH_LONG).show();
                  }
              });
              builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      Toast.makeText(Alert_Dialog.this,"You Click No",Toast.LENGTH_LONG).show();
                  }
              });
              builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      Toast.makeText(Alert_Dialog.this,"You Click Cancel",Toast.LENGTH_LONG).show();
                      dialogInterface.cancel();
                  }
              });
              AlertDialog diag=builder.create();
              diag.show();
          }
      });
    }
}
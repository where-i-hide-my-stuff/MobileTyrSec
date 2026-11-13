package com.example.mobiletyrsec;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Alert_Rating extends AppCompatActivity {
Button btn;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_rating);
      btn=(Button)findViewById(R.id.btnalertrating);
      txt=(TextView)findViewById(R.id.txtResult);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              ShowDialog();
          }

          private void ShowDialog() {
              AlertDialog.Builder popDialog=new AlertDialog.Builder(Alert_Rating.this);
              RatingBar rating=new RatingBar(Alert_Rating.this);
              rating.setMax(6);
              popDialog.setIcon(android.R.drawable.btn_star_big_on);
              popDialog.setTitle("Vote!");
              popDialog.setMessage("Please Select Stars...!");
              popDialog.setView(rating);
              popDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      dialogInterface.dismiss();
                      txt.setText(String.valueOf(rating.getProgress()));
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
package com.example.mobiletyrsec;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Alert_Input extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_input);
        btn=(Button)findViewById(R.id.btnAlertInput);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDialog();
            }

            private void ShowDialog() {
                AlertDialog.Builder dDialog=new AlertDialog.Builder(Alert_Input.this);
                EditText input=new EditText(Alert_Input.this);
                dDialog.setIcon(android.R.drawable.btn_star_big_on);
                dDialog.setTitle("Require!");
                dDialog.setCancelable(false);
                dDialog.setMessage("Please Input Name:");
                dDialog.setView(input);
                dDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String value=input.getText().toString();
                        Toast.makeText(Alert_Input.this,"Name="+value,Toast.LENGTH_LONG).show();
                    }
                });
                dDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                dDialog.show();
            }
        });
    }
}
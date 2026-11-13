package com.example.mobiletyrsec;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckBoxes extends AppCompatActivity {
CheckBox checkjava,checkcpp,checkpython;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_check_boxes);
        checkjava=(CheckBox) findViewById(R.id.btcheckJava);
        checkcpp=(CheckBox) findViewById(R.id.btcheckcpp);
        checkpython=(CheckBox) findViewById(R.id.btcheckpython);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result="Selected:";
                if(checkjava.isChecked())
                    result+="JAVA";
                if(checkcpp.isChecked())
                    result+="C++";
                if(checkpython.isChecked())
                    result+="Python";
                if(result.equals("Selected:"))
                    result="Nothing Selected";
                Toast.makeText(CheckBoxes.this,result,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class calculator2 extends AppCompatActivity {
TextView txt,txt1,txt2,txt3;
double num1,num2,sum,sub,mult,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator2);
     txt=(TextView)findViewById(R.id.txtsum);
     txt1=(TextView) findViewById(R.id.txtsub);
     txt2=(TextView) findViewById(R.id.txtmult);
     txt3=(TextView) findViewById(R.id.txtdiv);
     Intent k=getIntent();
     String number1=k.getStringExtra("r");
     String number2=k.getStringExtra("f");
 num1=Double.parseDouble(number1);
 num2=Double.parseDouble(number2);
 sum=num1+num2;
 sub=num1-num2;
 mult=num1*num2;
 div=num1/num2;
        txt.setText("Sum="+sum);
        txt1.setText("Sub="+sub);
        txt2.setText("Mult="+mult);
        txt3.setText("Div="+div);
    }
}
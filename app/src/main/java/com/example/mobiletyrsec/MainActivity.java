package com.example.mobiletyrsec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
     btn=(Button)findViewById(R.id.btngo);
     btn1=(Button)findViewById(R.id.btngotointentcall);
     btn2=(Button)findViewById(R.id.btngotoweb);
     btn3=(Button)findViewById(R.id.btngotocontact);
     btn4=(Button)findViewById(R.id.btngotoclac);
     btn5=(Button)findViewById(R.id.btngototoast);
     btn6=(Button)findViewById(R.id.btngotoalert);
     btn7=(Button)findViewById(R.id.btngotoalertinput);
     btn8=(Button)findViewById(R.id.btngotoalertxml);
     btn9=(Button)findViewById(R.id.btngotoalertrating);
     btn10=(Button)findViewById(R.id.btngotolistview);
     btn11=(Button)findViewById(R.id.btngotospinner);
     btn12=(Button)findViewById(R.id.btngotogrid);
     btn13=(Button)findViewById(R.id.btnlistItems);
     btn14=(Button)findViewById(R.id.btncheckboxes);
     btn15=(Button)findViewById(R.id.btntraffic);
     btn16=(Button)findViewById(R.id.btnmenu);
     btn17=(Button)findViewById(R.id.btnbatterylevel);
     btn18=(Button)findViewById(R.id.btngotoservice);

     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(MainActivity.this,Activity1.class);
             startActivity(i);
         }
     });
     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(MainActivity.this,IntentCall.class);
             startActivity(i);
         }
     });
     btn2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(MainActivity.this,Intenttoweb.class);
             startActivity(i);
         }
     });
     btn3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(MainActivity.this,Intenttocontact.class);
             startActivity(i);
         }
     });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, calculator1.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Toast_Definition.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Alert_Dialog.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Alert_Input.class);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Alert_Xml.class);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Alert_Rating.class);
                startActivity(i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Fill_ListView.class);
                startActivity(i);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Fill_Spinner.class);
                startActivity(i);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Fill_GridView.class);
                startActivity(i);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, ListView_Items.class);
                startActivity(i);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, CheckBoxes.class);
                startActivity(i);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Traffic_Light.class);
                startActivity(i);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Lab_Menu.class);
                startActivity(i);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Battery_Level.class);
                startActivity(i);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, lab_Service.class);
                startActivity(i);
            }
        });

    }
}
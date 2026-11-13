package com.example.mobiletyrsec;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab_Menu extends AppCompatActivity {
Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab_menu);
       tb=(Toolbar) findViewById(R.id.toolbar);
       setSupportActionBar(tb);
    }
    //Create Menu
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    //Menu Item Click
    public boolean onOptionsItemSelected(MenuItem item){
      if(item.getItemId()==R.id.add){
          Toast.makeText(this,"Add Selected",
                  Toast.LENGTH_LONG).show();
      }
      if(item.getItemId()==R.id.delete){
          Toast.makeText(this,"Delete Selected",
                  Toast.LENGTH_LONG).show();
      }
        if(item.getItemId()==R.id.exit){
            finish();
        }

        return true;
    }
}
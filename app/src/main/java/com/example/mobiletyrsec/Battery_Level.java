package com.example.mobiletyrsec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Battery_Level extends AppCompatActivity {
BroadcastReceiver receiver=new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
       if(intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {
           int level=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
           Toast.makeText(Battery_Level.this,
                   "Battery Level="+level,Toast.LENGTH_LONG).show();
       }
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_battery_level);
        //in android an intent filter specifies the type of intent (like activity,
        //service,Broadcast)and handle and enable other applications to start it
        //with specific intent
        IntentFilter filter=new IntentFilter();
        filter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(receiver,filter);
    }
}
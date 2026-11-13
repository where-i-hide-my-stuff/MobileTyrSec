package com.example.mobiletyrsec;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
  MediaPlayer mp;
public void onCreate(){
    super.onCreate();
    mp=MediaPlayer.create(this,R.raw.music) ;
    Toast.makeText(this,"Service Created",Toast.LENGTH_LONG).show();
}
public int onStartCommand(Intent intent,int flags,int startId){
    mp.start();
    Toast.makeText(this,"Music Started",Toast.LENGTH_LONG).show();
    return START_STICKY;
}
public void onDestroy(){
    mp.stop();
    Toast.makeText(this,"Music Stopped",Toast.LENGTH_LONG).show();
    super.onDestroy();
}
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

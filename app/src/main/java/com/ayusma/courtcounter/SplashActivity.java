package com.ayusma.courtcounter;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.widget.VideoView;

public class SplashActivity extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },7000);

        VideoView vv= (VideoView)findViewById(R.id.videoView);
        String path = "android.resource://com.ayusma.video/"+R.raw.basketballsmall;
        vv.setVideoPath(path);
        vv.start();



    }
}
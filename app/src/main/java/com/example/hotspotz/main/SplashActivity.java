package com.example.hotspotz.main;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.example.hotspotz.R;

public class SplashActivity extends Activity implements View.OnClickListener{

    private Button btn;
//    private VideoView vv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

//        vv = (VideoView)findViewById(R.id.VideoView1);
//
//        //Video Loop
////        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
////            public void onCompletion(MediaPlayer mp) {
////                vv.start(); //need to make transition seamless.
////            }
////        });
//
//        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
//
//        Uri uri = Uri.parse("android.resource://com.example/"
//                + R.raw.splash_end);
//
//        vv.setVideoURI(uri);
//        vv.requestFocus();
//        vv.start();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case(R.id.button):
                Intent intent = new Intent(this, CategoryNavigatorActivity.class);
                startActivity(intent);
                break;
        }
    }
}

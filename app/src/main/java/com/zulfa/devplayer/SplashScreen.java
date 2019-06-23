package com.zulfa.devplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.zulfa.devplayer.splash.ProgressBarAnim;

public class SplashScreen extends Activity {

    private TextView textView, tvBio;
    Animation atgsc;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        atgsc = AnimationUtils.loadAnimation(this, R.anim.atgsc);
        tvBio = findViewById(R.id.tvBiodata);
        tvBio.startAnimation(atgsc);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        progressBar = (ProgressBar)findViewById(R.id.progressbar);
//        textView = (TextView)findViewById(R.id.text_view);
//
//        progressBar.setMax(100);
//        progressBar.setScaleY(3);
//
//        ProgressAnimation();

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }

    private void ProgressAnimation() {
        ProgressBarAnim anim = new ProgressBarAnim(this, progressBar, textView, 0f, 100f);
        anim.setDuration(4000);
        progressBar.setAnimation(anim);
    }
}

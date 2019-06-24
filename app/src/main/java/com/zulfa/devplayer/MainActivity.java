package com.zulfa.devplayer;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private SliderLayout sliderLayout;

    private ImageView php,java1;
    private Toolbar toll;
    private Object Toolbar;
    private CardView cv,cv1,cv2,cv3;
    private TextView tv;
    private Button btn;

    Animation atgsc,atgsc1;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atgsc = AnimationUtils.loadAnimation(this, R.anim.atgsc);
        tv = findViewById(R.id.nameuser);
        tv.startAnimation(atgsc);

        atgsc = AnimationUtils.loadAnimation(this, R.anim.atgsc);
        btn = findViewById(R.id.cb_user);
        btn.startAnimation(atgsc);

        php = findViewById(R.id.php);
        java1= findViewById(R.id.java);
//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

//        setSupportActionBar(toolbar);
//        getSupportActionBar().setLogo(R.drawable.ic_camera_black_24dp);
//        getSupportActionBar().setTitle("");


        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, PHP.class);
                startActivity(a);

            }
        });

        java1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, JAVA.class);
                startActivity(a);
            }
        });
        }

    }

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
    private CardView cv;
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

//        atgsc1 = AnimationUtils.loadAnimation(this, R.anim.atgsc1);
        cv = findViewById(R.id.cv1);
//        cv.startAnimation(atgsc1);

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

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(php, "imagephp");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);

                startActivity(a, options.toBundle());

            }
        });

        java1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, JAVA.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(java1, "imagejava");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);

                startActivity(a, options.toBundle());
            }
        });

//        sliderLayout = (SliderLayout) findViewById(R.id.slider);
        // Load image dari URL
//        HashMap<String,String> url_maps = new HashMap<String, String>();
//        url_maps.put("Hannibal", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
//        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
//        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
//        url_maps.put("Game of Thrones", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
//        // Load Image Dari res/drawable
//        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
//        file_maps.put("Autis",R.drawable.autis);
//        file_maps.put("Oppo",R.drawable.oppoa5s);
//        file_maps.put("Ponsel",R.drawable.ponsel);
//        file_maps.put("PHP", R.drawable.php);
//        for(String name : file_maps.keySet()){
//            TextSliderView textSliderView = new TextSliderView(this);
//            // initialize a SliderLayout
//            textSliderView
//                    .description(name)
//                    .image(file_maps.get(name))
//                    .setScaleType(BaseSliderView.ScaleType.Fit);
//            //add your extra information
//            textSliderView.bundle(new Bundle());
//            textSliderView.getBundle()
//                    .putString("extra",name);
//            sliderLayout.addSlider(textSliderView);
//        }
//        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
//        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
//        sliderLayout.setCustomAnimation(new DescriptionAnimation());
//        sliderLayout.setDuration(4000);

    }
}

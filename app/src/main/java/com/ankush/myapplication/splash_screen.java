package com.ankush.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class splash_screen extends AppCompatActivity {

    ImageView sp;
    TextView sp_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        sp=findViewById(R.id.splash_img);
        sp_txt=findViewById(R.id.splash_txt);

        sp.setImageResource(R.drawable.icon);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                YoYo.with(Techniques.BounceInDown)
                        .duration(700)
                        .repeat(0)
                        .playOn(sp);
                YoYo.with(Techniques.BounceInUp)
                        .duration(700)
                        .repeat(0)
                        .playOn(sp_txt);
                 OpenDashBoard();

            }
        },1000);


    }
    public void OpenDashBoard() {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
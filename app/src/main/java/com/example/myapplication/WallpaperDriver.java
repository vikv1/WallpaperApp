package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

public class WallpaperDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView welcome = (TextView) findViewById(R.id.greeting); //creates textview object for greeting
        final TextView welcomePara = (TextView) findViewById(R.id.welcomePara); //creates textview object for welcome paragraph
        final Button startBtn = (Button) findViewById(R.id.start_button); //creates button object

        AlphaAnimation greetingFadeIn = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        greetingFadeIn.setDuration(1000);
        greetingFadeIn.setStartOffset(750);

        AlphaAnimation paragraphFadeIn = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        paragraphFadeIn.setDuration(1000);
        paragraphFadeIn.setStartOffset(1250);

        AlphaAnimation buttonFadeIn = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        buttonFadeIn.setDuration(1000);
        buttonFadeIn.setStartOffset(1650);

        AlphaAnimation fadeOut = new AlphaAnimation( 1.0f , 0.0f ) ; //fade out animation

        welcome.setAnimation(greetingFadeIn); //fades in "Hi!"
        welcomePara.setAnimation(paragraphFadeIn); //fades in intro paragraph
        startBtn.setAnimation(buttonFadeIn);

    }
    public void changeToMain(View view) {
        startActivity(new Intent(WallpaperDriver.this, Main1Activity.class));

    }
}
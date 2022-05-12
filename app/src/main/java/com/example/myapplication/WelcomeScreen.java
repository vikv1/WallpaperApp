package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.ui.login.LoginActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView welcome = (TextView) findViewById(R.id.greeting); //creates textview object for greeting
        final TextView welcomePara = (TextView) findViewById(R.id.welcomePara); //creates textview object for welcome paragraph
        final Button guestBtn = (Button) findViewById(R.id.guest_button); //creates guest object
        final Button logInBtn = (Button) findViewById(R.id.login_button); //creates login button object

        AlphaAnimation greetingFadeIn = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        greetingFadeIn.setDuration(1000);
        greetingFadeIn.setStartOffset(750);

        AlphaAnimation paragraphFadeIn = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        paragraphFadeIn.setDuration(1000);
        paragraphFadeIn.setStartOffset(1250);

        AlphaAnimation buttonFadeIn1 = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        buttonFadeIn1.setDuration(1000);
        buttonFadeIn1.setStartOffset(1650);

        AlphaAnimation buttonFadeIn2 = new AlphaAnimation(0.0f , 1.0f ) ; //fade in animation
        buttonFadeIn2.setDuration(1000);
        buttonFadeIn2.setStartOffset(1950);

        AlphaAnimation fadeOut = new AlphaAnimation( 1.0f , 0.0f ) ; //fade out animation

        welcome.setAnimation(greetingFadeIn); //fades in "Hi!"
        welcomePara.setAnimation(paragraphFadeIn); //fades in intro paragraph
        guestBtn.setAnimation(buttonFadeIn1);
        logInBtn.setAnimation(buttonFadeIn2);


    }
    public void changeToMain(View view) {
        startActivity(new Intent(WelcomeScreen.this, Main1Activity.class));
    }

    public void logIn(View view) {
        startActivity(new Intent(WelcomeScreen.this, LoginActivity.class));
    }

}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Support extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
    }

    //called on emailBtn click
    protected void sendEmail(View v) {
        String subject = "Support";
        String body = "Support Request";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:vikrantverma11@outlook.com?subject=" + Uri.encode(subject) + "&body=" + Uri.encode(body));
        intent.setData(data);
        startActivity(intent);

    }
}

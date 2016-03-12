package com.example.gauthamhemanth.portfolioapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClicked(View v) {
        CharSequence message = " ";
        switch (v.getId()) {
            case R.id.spotify_bt:
                message = "This button will launch Spotify Streamer";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            case R.id.score_bt:
                message = "This button will launch Score App";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            case R.id.library_bt:
                message = "This button will launch Library App";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            case R.id.build_bt:
                message = "This button will launch Build it Bigger";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            case R.id.xyz_bt:
                message = "This button will launch xyz Reader App";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            case R.id.capstone_bt:
                message = "This button will launch my Capstone App";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

        }

    }


}

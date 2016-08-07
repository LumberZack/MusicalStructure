package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Finding the Home Button
        View home = findViewById(R.id.homeButton);
        //Establishing Event Listener to change the activity
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeIntent = new Intent(Albums.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        //Finding the NowPlaying Button
        View now = findViewById(R.id.nowPlayingView);
        //Establishing Event Listener to change the activity
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(Albums.this, NowPlaying.class);
                startActivity(nowIntent);
            }
        });
    }
}

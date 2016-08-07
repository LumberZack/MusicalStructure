package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding the Albums Button
        View albums = findViewById(R.id.albumView);
        //Establishing Event Listener to change the activity
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        //Finding the Artists Button
        View artists = findViewById(R.id.artistView);
        //Establishing Event Listener to change the activity
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        //Finding the Songs Button
        View songs = findViewById(R.id.songView);
        //Establishing Event Listener to change the activity
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });

        //Finding the NowPlaying Button
        View now = findViewById(R.id.nowPlayingView);
        //Establishing Event Listener to change the activity
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowIntent);
            }
        });
    }
}

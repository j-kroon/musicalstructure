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

        // Find the View that shows the nowPlaying category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nowPlaying View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the setLists category
        TextView setLists = (TextView) findViewById(R.id.setLists);

        // Set a click listener on that View
        setLists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the setLists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent setListsIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(setListsIntent);
            }
        });

        // Find the View that shows the lyrics category
        TextView lyrics = (TextView) findViewById(R.id.lyrics);

        // Set a click listener on that View
        lyrics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the lyrics View is clicked on.
            @Override
            public void onClick(View view) {
                Intent lyricsIntent = new Intent(MainActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });

        // Find the View that shows the lyrics category
        TextView tabs = (TextView) findViewById(R.id.tabs);

        // Set a click listener on that View
        tabs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the tabs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent tabsIntent = new Intent(MainActivity.this, TabActivity.class);
                startActivity(tabsIntent);
            }
        });


    }
}

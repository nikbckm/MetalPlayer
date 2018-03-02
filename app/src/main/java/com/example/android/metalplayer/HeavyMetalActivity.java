package com.example.android.metalplayer;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;


public class HeavyMetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Master of Puppets", "Metallica"));
        songs.add(new Song("The Trooper", "Iron Maiden"));
        songs.add(new Song("Pull Me Under", "Dream Theater"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.songs_list);


        //make clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
                String song = songs.get(0).toString();
                Intent myIntent = new Intent(getApplicationContext(), MusicPlayer.class);
                startActivity(myIntent);
            }
        });

        listView.setAdapter(adapter);

    }


}

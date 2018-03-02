package com.example.android.metalplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MetalcoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Doomsday", "Architects"));
        songs.add(new Song("Engine 45", "The Ghost Inside"));
        songs.add(new Song("Invisibile Enemy", "August Burns Red"));
        songs.add(new Song("Skies", "Protest The Hero"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(adapter);

        //make clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
                Intent myIntent = new Intent(getApplicationContext(), MusicPlayer.class);
                startActivity(myIntent);
            }
        });

    }

    public void objectClicked(View view){
        Intent musicPlayer = new Intent(getApplicationContext(), MusicPlayer.class);
        startActivity(musicPlayer);
    }


}

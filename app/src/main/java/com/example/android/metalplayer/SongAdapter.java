package com.example.android.metalplayer;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NiklasBöckmann on 02.03.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list_layout, parent, false);
        }



        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTitle_text_view = (TextView) listItemView.findViewById(R.id.songTitle_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTitle_text_view.setText(currentSong.getSongtitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artist_text_view = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artist_text_view.setText(currentSong.getArtist());


        /*// Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        *//*
        Get the image resource ID from the current AndroidFlavor object and
        set the image to iconView
        *//*
        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());*/

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
package com.example.android.metalplayer;

/**
 * Created by NiklasBöckmann on 01.03.2018.
 */


/**
 * {@link Song} represents a Song - contains Cover, Songtitle, Artist  */
public class Song {

    private String mSongtitle;
    private String mArtist;

    public Song(String songtitle, String artist) {
        mSongtitle = songtitle;
        mArtist = artist;
    }

    /**
     * Get the songtitle.
     */
    public String getSongtitle() {
        return mSongtitle;
    }

    /**
     * Get the Artist.
     */
    public String getArtist() {
        return mArtist;
    }

}

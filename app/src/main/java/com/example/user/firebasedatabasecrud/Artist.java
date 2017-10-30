package com.example.user.firebasedatabasecrud;

/**
 * Created by user on 2017-10-30.
 */

public class Artist {

    String artistId;
    String artistName;

    public Artist(){}

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}

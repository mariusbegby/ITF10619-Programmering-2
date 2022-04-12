package no.hiof.mariubeg.Models;

import java.util.ArrayList;

public class Music extends Entertainment {
    private String artistName;
    private String coverArtURL;
    private int durationInSeconds;
    private boolean explicit;

    public Music(String name, String description, int releaseYear, double rating, ArrayList<String> genres, String artistName, String coverArtURL, int durationInSeconds, boolean explicit) {
        super(name, description, releaseYear, rating, genres);
        this.artistName = artistName;
        this.coverArtURL = coverArtURL;
        this.durationInSeconds = durationInSeconds;
        this.explicit = explicit;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCoverArtURL() {
        return coverArtURL;
    }

    public void setCoverArtURL(String coverArtURL) {
        this.coverArtURL = coverArtURL;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }
}

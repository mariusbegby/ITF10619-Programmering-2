package no.hiof.mariubeg.Models;

import java.util.ArrayList;

public class VideoGame extends Entertainment {
    private String developer;
    private String publisher;
    private String coverArtURL;
    private ArrayList<String> platforms;

    public VideoGame(String name, String description, int releaseYear, double rating, ArrayList<String> genres, String developer, String publisher, String coverArtURL, ArrayList<String> platforms) {
        super(name, description, releaseYear, rating, genres);
        this.developer = developer;
        this.publisher = publisher;
        this.coverArtURL = coverArtURL;
        this.platforms = platforms;
    }

    public String getCoverArtURL() {
        return coverArtURL;
    }

    public void setCoverArtURL(String coverArtURL) {
        this.coverArtURL = coverArtURL;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<String> platforms) {
        this.platforms = platforms;
    }
}

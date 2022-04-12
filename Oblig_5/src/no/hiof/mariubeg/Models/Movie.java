package no.hiof.mariubeg.Models;

import java.util.ArrayList;

public class Movie extends Entertainment{
    private String directorName;
    private String posterURL;
    private ArrayList<String> starActors;
    private int durationInMinutes;
    private int boxOfficeWorld;

    public Movie(String name, String description, int releaseYear, double rating, ArrayList<String> genres, String directorName, String posterURL, ArrayList<String> starActors, int durationInMinutes, int boxOfficeWorld) {
        super(name, description, releaseYear, rating, genres);
        this.directorName = directorName;
        this.posterURL = posterURL;
        this.starActors = starActors;
        this.durationInMinutes = durationInMinutes;
        this.boxOfficeWorld = boxOfficeWorld;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    public ArrayList<String> getStarActors() {
        return starActors;
    }

    public void setStarActors(ArrayList<String> starActors) {
        this.starActors = starActors;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getBoxOfficeWorld() {
        return boxOfficeWorld;
    }

    public void setBoxOfficeWorld(int boxOfficeWorld) {
        this.boxOfficeWorld = boxOfficeWorld;
    }
}

package no.hiof.mariubeg.Models;

import java.util.ArrayList;

public class Entertainment {
    private String name;
    private String description;
    private int releaseYear;
    private double rating;
    private ArrayList<String> genres;

    public Entertainment(String name, String description, int releaseYear, double rating, ArrayList<String> genres) {
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }
}

package no.hiof.mariubeg;

import no.hiof.mariubeg.Forms.MainForm;
import no.hiof.mariubeg.Models.Music;
import no.hiof.mariubeg.Models.Movie;
import no.hiof.mariubeg.Models.VideoGame;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MainForm mainWindow = new MainForm("Entertainment browser");
        mainWindow.setVisible(true);

        VideoGame cyberpunk_2077 = new VideoGame(
            "Cyberpunk 2077",
            "Cyberpunk 2077 is an open-world, action-adventure RPG set in the dark future of Night City — a dangerous megalopolis obsessed with power, glamor, and ceaseless body modification.",
            2020,
            86,
            new ArrayList<>(),
            "CD PROJEKT RED",
            "CD PROJEKT RED",
            "https://cdn.akamai.steamstatic.com/steam/apps/1091500/header.jpg",
            new ArrayList<>()
        );
        cyberpunk_2077.getGenres().add("Cyberpunk");
        cyberpunk_2077.getGenres().add("Open World");
        cyberpunk_2077.getGenres().add("RPG");
        cyberpunk_2077.getGenres().add("Sci-fi");
        cyberpunk_2077.getGenres().add("Futuristic");
        cyberpunk_2077.getPlatforms().add("PC");
        cyberpunk_2077.getPlatforms().add("Xbox");
        cyberpunk_2077.getPlatforms().add("Playstation");

        VideoGame terraria = new VideoGame(
            "Terraria",
            "Terraria is a land of adventure! A land of mystery! A land that's yours to shape, defend, and enjoy. Your options in Terraria are limitless. Are you an action gamer with an itchy trigger finger? A master builder? A collector? An explorer? There's something for everyone.",
            2011,
            83,
            new ArrayList<>(),
            "Re-Logic",
            "Re-Logic",
            "https://cdn.akamai.steamstatic.com/steam/apps/105600/header.jpg?t=1590092560",
            new ArrayList<>()
        );
        terraria.getGenres().add("Open World Survival Craft");
        terraria.getGenres().add("Sandbox");
        terraria.getGenres().add("Survival");
        terraria.getGenres().add("2D");
        terraria.getPlatforms().add("PC");
        terraria.getPlatforms().add("Xbox");
        terraria.getPlatforms().add("Playstation");
        terraria.getPlatforms().add("iOS");
        terraria.getPlatforms().add("Android");

        Music dont_stop_me_now = new Music(
            "Don't Stop Me Now",
            "“Don’t Stop Me Now” is one of Queen’s masterpieces, a song that’s aged well with time and landed third on Rolling Stone’s list of the Top 10 Queen Songs.",
            1978,
            90,
            new ArrayList<>(),
            "Queen",
            "https://cdn2.albumoftheyear.org/250x/album/178244-dont-stop-me-now.jpg",
            211,
            false
        );
        dont_stop_me_now.getGenres().add("Pop rock");
        dont_stop_me_now.getGenres().add("Hard rock");
        dont_stop_me_now.getGenres().add("Power pop");

        Movie parasite = new Movie(
            "Parasite",
            "Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.",
            2019,
            85,
            new ArrayList<>(),
            "Bong Joon Ho",
            "https://image.tmdb.org/t/p/original/5uz9Se5HBxxPdJY38rPfyWUyjDZ.jpg",
            new ArrayList<>(),
            132,
            258_632_621
        );
        parasite.getStarActors().add("Kang-ho Song");
        parasite.getStarActors().add("Sun-kyun Lee");
        parasite.getStarActors().add("Yeo-jeong Cho");
        parasite.getGenres().add("Comedy");
        parasite.getGenres().add("Drama");
        parasite.getGenres().add("Horror");

        Movie pulp_fiction = new Movie(
            "Pulp Fiction",
            "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
            1994,
            89,
            new ArrayList<>(),
            "Quentin Tarantino",
            "https://image.tmdb.org/t/p/original/on5fMsjLKMJX6ic4anPKwVnuExu.jpg",
            new ArrayList<>(),
            154,
            107_928_762
        );
        pulp_fiction.getStarActors().add("John Travolta");
        pulp_fiction.getStarActors().add("Uma Thurman");
        pulp_fiction.getStarActors().add("Samuel L. Jackson");
        pulp_fiction.getGenres().add("Crime");
        pulp_fiction.getGenres().add("Drama");

        mainWindow.addEntertainment(cyberpunk_2077);
        mainWindow.addEntertainment(dont_stop_me_now);
        mainWindow.addEntertainment(parasite);
        mainWindow.addEntertainment(terraria);
        mainWindow.addEntertainment(pulp_fiction);
    }
}

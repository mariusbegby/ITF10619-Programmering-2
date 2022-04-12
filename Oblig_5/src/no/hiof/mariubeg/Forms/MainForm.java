package no.hiof.mariubeg.Forms;

import no.hiof.mariubeg.Models.Entertainment;
import no.hiof.mariubeg.Models.Movie;
import no.hiof.mariubeg.Models.Music;
import no.hiof.mariubeg.Models.VideoGame;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JList<String> entertainmentJList;
    private JScrollPane entertainmentJListScrollPane;
    private JTextField nameTextField;
    private JLabel nameJLabel;
    private JLabel descriptionJLabel;
    private JLabel releaseYearJLabel;
    private JTextField releaseYearTextField;
    private JLabel ratingJLabel;
    private JTextField ratingTextField;
    private JLabel genresJLabel;
    private JTextField genresTextField;
    private JButton saveChangesButton;
    private JButton deleteSelectedButton;
    private JTextField videogameDeveloperTextField;
    private JLabel videogameDeveloperJLabel;
    private JTextField videogamePublisherTextField;
    private JLabel videogamePublisherJLabel;
    private JLabel videogameCoverArtURLJLabel;
    private JTextField videogameCoverArtURLTextField;
    private JLabel videogamePlatformsJLabel;
    private JTextField videogamePlatformsTextField;
    private JLabel musicArtistJLabel;
    private JTextField musicArtistTextField;
    private JLabel musicCoverArtUrlJLabel;
    private JTextField musicCoverArtURLTextField;
    private JTextField musicDurationInSecondsTextField;
    private JLabel musicDurationInSecondsJLabel;
    private JLabel musicExplicitJLabel;
    private JTextField musicExplicitTextField;
    private JLabel movieDirectorJLabel;
    private JTextField movieDirectorTextField;
    private JLabel moviePosterURLJLabel;
    private JTextField moviePosterURLTextField;
    private JLabel movieStarActorsJLabel;
    private JTextField movieStarActorsTextField;
    private JLabel movieDurationInMinutesJLabel;
    private JTextField movieDurationInMinutesTextField;
    private JLabel movieBoxOfficeWorldJLabel;
    private JTextField movieBoxOfficeWorldTextField;
    private JTextArea descriptionTextArea;
    private JButton exitButton;
    private JPanel videoGameJPanel;
    private JPanel musicJPanel;
    private JPanel movieJPanel;
    private ArrayList<Entertainment> listOfEntertainment;
    private DefaultListModel<String> entertainmentJListModel;

    public MainForm(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 600);

        listOfEntertainment = new ArrayList<Entertainment>();
        entertainmentJListModel = new DefaultListModel<>();
        entertainmentJList.setModel(entertainmentJListModel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        videoGameJPanel.setVisible(false);
        musicJPanel.setVisible(false);
        movieJPanel.setVisible(false);
        saveChangesButton.setEnabled(false);
        deleteSelectedButton.setEnabled(false);

        entertainmentJList.addListSelectionListener(e -> {
            int selectedIndex = entertainmentJList.getSelectedIndex();
            if (selectedIndex >= 0) {
                saveChangesButton.setEnabled(true);
                deleteSelectedButton.setEnabled(true);
                Entertainment selectedObject = listOfEntertainment.get(selectedIndex);
                if (selectedObject instanceof VideoGame) {
                    videogameDeveloperTextField.setText(((VideoGame) selectedObject).getDeveloper());
                    videogamePublisherTextField.setText(((VideoGame) selectedObject).getPublisher());
                    videogameCoverArtURLTextField.setText(((VideoGame) selectedObject).getCoverArtURL());
                    videogamePlatformsTextField.setText(String.valueOf(((VideoGame) selectedObject).getPlatforms()));

                    videoGameJPanel.setVisible(true);
                    musicJPanel.setVisible(false);
                    movieJPanel.setVisible(false);
                } else if (selectedObject instanceof Music) {
                    musicArtistTextField.setText(((Music) selectedObject).getArtistName());
                    musicCoverArtURLTextField.setText(((Music) selectedObject).getCoverArtURL());
                    musicDurationInSecondsTextField.setText(String.valueOf(((Music) selectedObject).getDurationInSeconds()));
                    musicExplicitTextField.setText(String.valueOf(((Music) selectedObject).isExplicit()));

                    musicJPanel.setVisible(true);
                    videoGameJPanel.setVisible(false);
                    movieJPanel.setVisible(false);
                } else if (selectedObject instanceof Movie) {
                    movieDirectorTextField.setText(((Movie) selectedObject).getDirectorName());
                    moviePosterURLTextField.setText(((Movie) selectedObject).getPosterURL());
                    movieStarActorsTextField.setText(String.valueOf(((Movie) selectedObject).getStarActors()));
                    movieDurationInMinutesTextField.setText(String.valueOf(((Movie) selectedObject).getDurationInMinutes()));
                    movieBoxOfficeWorldTextField.setText(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(((Movie) selectedObject).getBoxOfficeWorld()));

                    movieJPanel.setVisible(true);
                    videoGameJPanel.setVisible(false);
                    musicJPanel.setVisible(false);
                }

                nameTextField.setText(selectedObject.getName());
                descriptionTextArea.setText(selectedObject.getDescription());
                releaseYearTextField.setText(String.valueOf(selectedObject.getReleaseYear()));
                ratingTextField.setText(String.valueOf(selectedObject.getRating()));
                genresTextField.setText(String.valueOf(selectedObject.getGenres()));

            } else {
                saveChangesButton.setEnabled(false);
                deleteSelectedButton.setEnabled(false);
            }
        });

        saveChangesButton.addActionListener(e -> {
            Entertainment selectedObject = listOfEntertainment.get(entertainmentJList.getSelectedIndex());

            selectedObject.setName(nameTextField.getText());
            selectedObject.setDescription(descriptionTextArea.getText());
            selectedObject.setReleaseYear(Integer.parseInt(releaseYearTextField.getText()));
            selectedObject.setRating(Double.parseDouble(ratingTextField.getText()));
            selectedObject.setGenres(stringToArrayList(genresTextField.getText()));

            if (selectedObject instanceof VideoGame) {
                ((VideoGame) selectedObject).setDeveloper(videogameDeveloperTextField.getText());
                ((VideoGame) selectedObject).setPublisher(videogamePublisherTextField.getText());
                ((VideoGame) selectedObject).setCoverArtURL(videogameCoverArtURLTextField.getText());
                ((VideoGame) selectedObject).setPlatforms(stringToArrayList(videogamePlatformsTextField.getText()));
            } else if (selectedObject instanceof Music) {
                ((Music) selectedObject).setArtistName(musicArtistTextField.getText());
                ((Music) selectedObject).setCoverArtURL(musicCoverArtURLTextField.getText());
                ((Music) selectedObject).setDurationInSeconds(Integer.parseInt(musicDurationInSecondsTextField.getText()));
                ((Music) selectedObject).setExplicit(Boolean.parseBoolean(musicExplicitTextField.getText()));
            } else if (selectedObject instanceof Movie) {
                ((Movie) selectedObject).setDirectorName(movieDirectorTextField.getText());
                ((Movie) selectedObject).setPosterURL(moviePosterURLTextField.getText());
                ((Movie) selectedObject).setStarActors(stringToArrayList(movieStarActorsTextField.getText()));
                ((Movie) selectedObject).setDurationInMinutes(Integer.parseInt(movieDurationInMinutesTextField.getText()));
                ((Movie) selectedObject).setBoxOfficeWorld(Integer.parseInt(movieBoxOfficeWorldTextField.getText().replace("$", "").replace(",", "").replace(".00", "")));
            }
            updateEntertainmentList();
        });

        deleteSelectedButton.addActionListener(e -> {
            int selectedIndex = entertainmentJList.getSelectedIndex();

            entertainmentJListModel.removeElementAt(selectedIndex);
            listOfEntertainment.remove(selectedIndex);
            updateEntertainmentList();
        });

        exitButton.addActionListener(e -> exitButton.addActionListener((event) -> System.exit(0)));

    }

    public ArrayList<String> stringToArrayList(String inputString) {
        String[] stringArray = inputString.replace("[", "").replace("]", "").split(", ");
        return new ArrayList<>(Arrays.asList(stringArray));
    }

    public void updateEntertainmentList() {
        entertainmentJListModel.removeAllElements();
        for(Entertainment object : listOfEntertainment) {
            if(object instanceof VideoGame) {
                entertainmentJListModel.addElement("[Video Game]: " + object.getName());
            } else if (object instanceof Music) {
                entertainmentJListModel.addElement("[Music]: " + ((Music) object).getArtistName() + " - " + object.getName());
            } else if (object instanceof Movie) {
                entertainmentJListModel.addElement("[Movie]: " + object.getName() + " (" + object.getReleaseYear() + ")");
            }
        }
        entertainmentJList.repaint();
    }

    public void addEntertainment(Entertainment object) {
        listOfEntertainment.add(object);
        updateEntertainmentList();
    }
}

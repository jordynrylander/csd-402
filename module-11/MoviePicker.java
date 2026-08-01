/*
 * Jordyn Rylander
 * Module 11.2 Assignment
 * CSD 402
 *
 * this program demonstrates the JavaFX TitledPane and Accordion controls
 * using a Movie Night Picker application.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MoviePicker extends Application {
// override the start method to set up the JavaFX application
    @Override
    public void start(Stage stage) {

// create labels for the application title and subtitle
        Label title = new Label("Movie Night Picker");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label subtitle = new Label("Choose a movie genre for tonight.");
        subtitle.setStyle("-fx-text-fill: gray;");

// create horror movie titles and add them to a VBox
        VBox horrorMovies = new VBox(5);
        horrorMovies.getChildren().addAll(
                new Label("Scream"),
                new Label("The Conjuring"),
                new Label("Obsession")
        );

        TitledPane horrorPane = new TitledPane("Horror", horrorMovies);
// create comedy movie titles and add them to a VBox
        VBox comedyMovies = new VBox(5);
        comedyMovies.getChildren().addAll(
                new Label("Grown Ups"),
                new Label("We're the Millers"),
                new Label("21 Jump Street")
        );

        TitledPane comedyPane = new TitledPane("Comedy", comedyMovies);
// create romance movie titles and add them to a VBox
        VBox romanceMovies = new VBox(5);
        romanceMovies.getChildren().addAll(
                new Label("The Notebook"),
                new Label("The Proposal"),
                new Label("Anyone But You")
        );

        TitledPane romancePane = new TitledPane("Romance", romanceMovies);
// create superhero movie titles and add them to a VBox
        VBox superheroMovies = new VBox(5);
        superheroMovies.getChildren().addAll(
                new Label("Spider-Man"),
                new Label("Iron Man"),
                new Label("Captain America")
        );

        TitledPane superheroPane = new TitledPane("Superheroes", superheroMovies);
// create an Accordion and add the TitledPanes to it
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(
                horrorPane,
                comedyPane,
                romancePane,
                superheroPane
        );

        accordion.setExpandedPane(horrorPane);
// create a VBox to hold the title, subtitle, and accordion
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        root.getChildren().addAll(
                title,
                subtitle,
                accordion
        );
// create a scene and set it on the stage
        Scene scene = new Scene(root, 400, 350);

        stage.setTitle("Movie Night Picker");
        stage.setScene(scene);
        stage.show();
    }
// main method to launch the application
    public static void main(String[] args) {
        launch(args);
    }
}
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    /**
     * @Author: Rik van Laerhoven
     */

    public void start(Stage stage) throws Exception {
        try {
            TabPane tabPane = new TabPane();
            Tab agenda = new Tab("Agenda");
            Tab data = new Tab("Data");
            Tab input = new Tab("Input");

            /**tabAgenda*/
            HBox tabAgenda = new HBox();
            VBox main = new VBox();
            VBox second = new VBox();
            VBox third = new VBox();
            VBox fourth = new VBox();

            /**tabData*/
            VBox name = new VBox();
            VBox genre = new VBox();
            VBox podium = new VBox();
            VBox popularity = new VBox();
            VBox time = new VBox();
            HBox tabData = new HBox();

            name.getChildren().add(new Label("Name"));
            genre.getChildren().add(new Label("Genre"));
            podium.getChildren().add(new Label("Stage"));
            popularity.getChildren().add(new Label("Popularity"));
            time.getChildren().add(new Label("Time"));

            tabData.getChildren().addAll(name, genre, podium, popularity, time);
            tabData.setSpacing(250);
            data.setContent(tabData);

            /**tabInput*/
            TextField nameTextfield = new TextField("Type name here");
            TextField genreTextfield = new TextField("Type genre here");
            TextField stageTextfield = new TextField("Type stage here");
            TextField popularityTextfield = new TextField("Type popularity here");

            HBox tabInput = new HBox();
            VBox inputData = new VBox();
            HBox nameInput = new HBox();
            HBox genreInput = new HBox();
            HBox stageInput = new HBox();
            HBox popularityInput = new HBox();
            HBox timeInput = new HBox();

            nameInput.getChildren().addAll(new Label("Name: "), nameTextfield);
            genreInput.getChildren().addAll(new Label("Genre: "), genreTextfield);
            stageInput.getChildren().addAll(new Label("Stage: "), stageTextfield);
            popularityInput.getChildren().addAll(new Label("Popularity: "), popularityTextfield);
            timeInput.getChildren().addAll(new Label("Time: "));

            inputData.getChildren().addAll(nameInput, genreInput, stageInput, popularityInput, timeInput);
            input.setContent(inputData);


            /**algemene regels*/
            tabPane.getTabs().add(agenda);
            tabPane.getTabs().add(data);
            tabPane.getTabs().add(input);

            BorderPane borderPane = new BorderPane();
            borderPane.setCenter(tabPane);
            Scene scene = new Scene(borderPane);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(GUI.class);
    }
}

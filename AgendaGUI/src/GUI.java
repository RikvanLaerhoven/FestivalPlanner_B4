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

            HBox content = new HBox();
            VBox values = new VBox();
            VBox textfields = new VBox();
            values.getChildren().addAll(new Label("Name: "),new Label("Genre: "),new Label("Stage: "),new Label("Popularity: "),new Label("Time: "));
            values.setSpacing(29);
            textfields.getChildren().addAll(nameTextfield,genreTextfield,stageTextfield,popularityTextfield);
            textfields.setSpacing(20);
            content.getChildren().addAll(values,textfields);
            content.setSpacing(10);

            input.setContent(content);


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

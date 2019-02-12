import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {

    public void start(Stage stage1) {
        TabPane tabPane = new TabPane();
        Tab agenda = new Tab("Agenda");
        Tab data = new Tab("Data");
        Tab input = new Tab("Input");
        VBox name = new VBox();
        VBox genre = new VBox();
        VBox podium = new VBox();
        VBox popularity = new VBox();
        VBox time = new VBox();
        VBox main = new VBox();
        VBox second = new VBox();
        VBox third = new VBox();
        VBox fourth = new VBox();

        name.getChildren().add(new Label("Name"));
        genre.getChildren().add(new Label("Genre"));
        podium.getChildren().add(new Label("Stage"));

        tabPane.getTabs().add(agenda);
        tabPane.getTabs().add(data);
        tabPane.getTabs().add(input);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(tabPane);
        Scene scene = new Scene(borderPane);
        stage1.setScene(scene);
        stage1.show();


        //tab1




    }

    public static void main(String[] args) {
        launch(GUI.class);
    }
}

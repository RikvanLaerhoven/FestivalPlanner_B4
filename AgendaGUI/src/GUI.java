import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    /**
     * @Author: Rik van Laerhoven
     */
    private String nameInput;
    private String genreInput;

    /** onderstaande variabelen horen bij de tab Input,
     * deze variabelen krijgen zodra op de enter knop wordt gedrukt de inhoud van het bijbehorden tekstveld.
     */
    private String nameInput;
    private String genreInput;
    private String stageInput;
    private String popularityInput;
    private String timeInput;

    public void start(Stage stage) throws Exception {
        try {
            TabPane tabPane = new TabPane();
            Tab agenda = new Tab("Agenda");
            Tab data = new Tab("Data");
            Tab input = new Tab("Input");

            /**tabAgenda
             *
             * MOET NOG GEMAAKT WORDEN
             *
             */
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
            GridPane gridPaneData = new GridPane();

            name.getChildren().add(new Label(stringEditor("Name")));
            genre.getChildren().add(new Label(stringEditor("Genre")));
            podium.getChildren().add(new Label(stringEditor("Stage")));
            popularity.getChildren().add(new Label(stringEditor("Popularity")));
            time.getChildren().add(new Label(stringEditor("Time")));

            //tabData.getChildren().addAll(name, genre, podium, popularity, time);
            tabData.setSpacing(250);
            data.setContent(tabData);

            gridPaneData.setGridLinesVisible(true);
            gridPaneData.add(name,1,1);
            gridPaneData.add(genre,2,1);
            gridPaneData.add(podium,3,1);
            gridPaneData.add(popularity, 4, 1);
            gridPaneData.add(time,5,1);
            tabData.getChildren().add(gridPaneData);


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

            Button buttonEnter = new Button("Enter");
            Button buttonImport = new Button("Import File");
            buttonEnter.setScaleY(2);
            buttonEnter.setScaleX(2);
            buttonImport.setScaleY(2);
            buttonImport.setScaleX(2);

            GridPane gridPaneInput = new GridPane();
            gridPaneInput.setHgap(50);
            gridPaneInput.setVgap(50);
            gridPaneInput.add(content,1,1);
            gridPaneInput.add(buttonEnter,1,2);
            gridPaneInput.add(buttonImport,3,2);

            input.setContent(gridPaneInput);


            /**algemene regels*/
            tabPane.getTabs().add(agenda);
            tabPane.getTabs().add(data);
            tabPane.getTabs().add(input);

            BorderPane borderPane = new BorderPane();
            borderPane.setCenter(tabPane);
            Scene scene = new Scene(borderPane);
            tabPane.setMinSize(500,400);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("AgendaPlanner");

            /**button handler*/
            buttonEnter.setOnAction(event -> { /** de handelingen van de Enter knop*/
                nameInput = nameTextfield.getText();
                genreInput = genreTextfield.getText();
                stageInput = stageTextfield.getText();
                popularityInput = popularityTextfield.getText();
                //iet voor de tijd
            });
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(GUI.class);
    }

    public String stringEditor(String inputText){
        return "  " + inputText + "  ";
    }
}

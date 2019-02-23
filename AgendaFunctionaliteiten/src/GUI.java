import javafx.application.Application;
import javafx.beans.value.ChangeListener;

import Performance.*;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class GUI extends Application {
    /**
     * @Author: Rik van Laerhoven & Boris Korevaar
     */

    /**
     * onderstaande variabelen horen bij de tab Input,
     * deze variabelen krijgen zodra op de enter knop wordt gedrukt de inhoud van het bijbehorden tekstveld.
     */
    private GridPane gridPaneData = new GridPane();
    private String nameInput;
    private String genreInput;
    private String stageInput;
    private String popularityInput;
    private String timeFromInput;
    private String timeToInput;
    private int dataCounter = 1;

    private Timetable timetable;


    public void start(Stage stage) throws Exception {
        try {

            TabPane tabPane = new TabPane();
            Tab agenda = new Tab("Agenda");
            Tab data = new Tab("Data");
            Tab input = new Tab("Input");

            /**tabAgenda*/
            VBox tabAgenda = new VBox();
            VBox main = new VBox();
            VBox second = new VBox();
            VBox third = new VBox();
            VBox fourth = new VBox();
            VBox timeAgenda = new VBox();
            VBox sedudl = new VBox();
            VBox sedudl2 = new VBox();
            VBox sedudl3 = new VBox();
            VBox sedudl4 = new VBox();
            VBox sedudl5 = new VBox();

            GridPane gridPaneAgenda = new GridPane();
            tabAgenda.setSpacing(250);
            agenda.setContent(tabAgenda);

            sedudl.getChildren().add(new Label(stringEditor("15:00\n  16:00")));
            sedudl2.getChildren().add(new Label(stringEditor("17:00\n  18:00")));
            sedudl3.getChildren().add(new Label(stringEditor("19:00\n  20:00")));
            sedudl4.getChildren().add(new Label(stringEditor("21:00\n  22:00")));
            sedudl5.getChildren().add(new Label(stringEditor("23:00\n  00:00")));

            main.getChildren().add(new Label(stringEditor("\tMain Stage\t\t")));
            second.getChildren().add(new Label(stringEditor("\tHill Stage\t")));
            third.getChildren().add(new Label(stringEditor("\tForest Stage\t\t")));
            fourth.getChildren().add(new Label(stringEditor("\tLame Stage\t")));
            timeAgenda.getChildren().add(new Label(stringEditor("Time ")));


            gridPaneAgenda.add(timeAgenda, 0, 0);
            gridPaneAgenda.add(main, 1, 0);
            gridPaneAgenda.add(second, 2, 0);
            gridPaneAgenda.add(third, 3, 0);
            gridPaneAgenda.add(fourth, 4, 0);
            gridPaneAgenda.add(sedudl, 0, 1);
            gridPaneAgenda.add(sedudl2, 0, 2);
            gridPaneAgenda.add(sedudl3, 0, 3);
            gridPaneAgenda.add(sedudl4, 0, 4);
            gridPaneAgenda.add(sedudl5, 0, 5);


            tabAgenda.getChildren().add(gridPaneAgenda);
            gridPaneAgenda.setGridLinesVisible(true);

            /**tabData*/
            VBox name = new VBox();
            VBox genre = new VBox();
            VBox podium = new VBox();
            VBox popularity = new VBox();
            VBox time = new VBox();
            HBox tabData = new HBox();
//            GridPane gridPaneData = new GridPane();

            name.getChildren().add(new Label(stringEditor("Name")));
            genre.getChildren().add(new Label(stringEditor("Genre")));
            podium.getChildren().add(new Label(stringEditor("Stage")));
            popularity.getChildren().add(new Label(stringEditor("Popularity")));
            time.getChildren().add(new Label(stringEditor("Time")));

            tabData.setSpacing(250);
            data.setContent(tabData);

            gridPaneData.setGridLinesVisible(true);
            gridPaneData.add(name, 1, 1);
            gridPaneData.add(genre, 2, 1);
            gridPaneData.add(podium, 3, 1);
            gridPaneData.add(popularity, 4, 1);
            gridPaneData.add(time, 5, 1);
            tabData.getChildren().add(gridPaneData);

            /**tabInput*/
            TextField nameTextfield = new TextField("Type name here");
            TextField genreTextfield = new TextField("Type genre here");
            TextField stageTextfield = new TextField("Type stage here");
            TextField popularityTextfield = new TextField("Type popularity here");
            TextField timeFromTextfield = new TextField();
            TextField timeToTextfield = new TextField();

            final Label notification = new Label();
            final Label saveNotification = new Label();

            AtomicReference<String> file = new AtomicReference<>("");
            AtomicReference<String> saveFile = new AtomicReference<>("");

            HBox content = new HBox();
            VBox values = new VBox();
            VBox textfields = new VBox();
            VBox fileInput = new VBox();
            VBox saveFileInput = new VBox();
            VBox timeTextfields = new VBox();
            HBox timeFromBox = new HBox();
            HBox timeToBox = new HBox();

            values.getChildren().addAll(new Label("Name: "), new Label("Genre: "), new Label("Stage: "), new Label("Popularity: "), new Label("Time: "));
            values.setSpacing(29);
            timeFromBox.getChildren().addAll(new Label("From: "), timeFromTextfield);
            timeToBox.getChildren().addAll(new Label("To:     "), timeToTextfield);
            timeTextfields.getChildren().addAll(timeFromBox, timeToBox);
            textfields.getChildren().addAll(nameTextfield, genreTextfield, stageTextfield, popularityTextfield, timeTextfields);
            textfields.setSpacing(20);
            content.getChildren().addAll(values, textfields);
            content.setSpacing(10);

            Button buttonEnter = new Button("Enter");
            Button buttonFileImport = new Button("Import File");
            Button buttonSaveFile = new Button("Save File");
            buttonSaveFile.setScaleY(2);
            buttonSaveFile.setScaleX(2);
            buttonEnter.setScaleY(2);
            buttonEnter.setScaleX(2);
            buttonFileImport.setScaleY(2);
            buttonFileImport.setScaleX(2);

            //combobox voor de file selectie
            final ComboBox fileComboBox = new ComboBox();
            fileComboBox.getItems().addAll(
                    "File1",
                    "File2",
                    "File3",
                    "File4"
            );
            fileComboBox.setPromptText("Select file");
            fileComboBox.setEditable(true);

            fileInput.getChildren().addAll(new Label("File: "), fileComboBox);
            GridPane gridPaneInput = new GridPane();
            gridPaneInput.setHgap(100);
            gridPaneInput.setVgap(50);
            gridPaneInput.add(content, 1, 1);
            gridPaneInput.add(buttonEnter, 1, 2);
            gridPaneInput.add(fileInput, 2, 1);
            gridPaneInput.add(buttonFileImport, 2, 2);
            gridPaneInput.add(notification, 2, 3, 1, 1);
            gridPaneInput.add(saveNotification, 3, 3, 1, 1);

            input.setContent(gridPaneInput);

            /**save file*/
            final ComboBox saveFileComboBox = new ComboBox();
            saveFileComboBox.getItems().addAll(
                    "File1",
                    "File2",
                    "File3",
                    "File4"
            );
            saveFileComboBox.setPromptText("Select file");
            saveFileComboBox.setEditable(true);

            saveFileInput.getChildren().addAll(new Label("Save File: "), saveFileComboBox);
            gridPaneInput.add(buttonSaveFile, 3, 2, 1, 1);
            gridPaneInput.add(saveFileInput, 3, 1);

            input.setContent(gridPaneInput);

            /**button handler voor save file input*/
            saveFileComboBox.valueProperty().addListener((ChangeListener<String>) (ov, t, t1) -> file.set(t1));
            buttonSaveFile.setOnAction(e -> {
                if (saveFileComboBox.getValue() != null &&
                        !saveFileComboBox.getValue().toString().isEmpty()) {
                    saveNotification.setText("You have selected file: " + "\"" + file + "\"");
                    saveFileComboBox.setValue(null);
                    if (saveFileComboBox.getValue() != null &&
                            !saveFileComboBox.getValue().toString().isEmpty()) {
                        saveFileComboBox.setValue(null);
                    }
                } else {
                    notification.setText("You have not selected a file");
                }
            });

            /**algemene regels*/
            tabPane.getTabs().add(agenda);
            tabPane.getTabs().add(data);
            tabPane.getTabs().add(input);

            BorderPane borderPane = new BorderPane();
            borderPane.setCenter(tabPane);
            Scene scene = new Scene(borderPane);
            tabPane.setMinSize(500, 400);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("AgendaPlanner");

            /**button handler*/
            buttonEnter.setOnAction(event -> { /** de handelingen van de Enter knop*/
                nameInput = nameTextfield.getText();
                genreInput = genreTextfield.getText();
                stageInput = stageTextfield.getText();
                popularityInput = popularityTextfield.getText();
                timeFromInput = timeFromTextfield.getText();
                timeToInput = timeToTextfield.getText();
                addData();
            });

            /**button handler voor file input*/
            fileComboBox.valueProperty().addListener((ChangeListener<String>) (ov, t, t1) -> file.set(t1));
            buttonFileImport.setOnAction(e -> {
                if (fileComboBox.getValue() != null &&
                        !fileComboBox.getValue().toString().isEmpty()) {
                    notification.setText("You have selected file: " + "\"" + file + "\"");
                    fileComboBox.setValue(null);
                    if (fileComboBox.getValue() != null &&
                            !fileComboBox.getValue().toString().isEmpty()) {
                        fileComboBox.setValue(null);
                    }
                } else {
                    notification.setText("You have not selected a file");
                }
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(GUI.class);
    }

    public String stringEditor(String inputText) {
        return "  " + inputText + "  ";
    }

    public void addData() {
        dataCounter++;
        gridPaneData.setGridLinesVisible(true);
        gridPaneData.add(new Label(stringEditor(nameInput)), 1, dataCounter);
        gridPaneData.add(new Label(stringEditor(genreInput)), 2, dataCounter);
        gridPaneData.add(new Label(stringEditor(stageInput)), 3, dataCounter);
        gridPaneData.add(new Label(stringEditor(popularityInput)), 4, dataCounter);
        gridPaneData.add(new Label(stringEditor(timeFromInput + " - " + timeToInput)), 5, dataCounter);

        ActiveStage temp = new ActiveStage(stageInput, Integer.parseInt(timeFromInput), Integer.parseInt(timeToInput));
        timetable.addPerformance( temp, new Artist(nameInput, genreInput, temp, Integer.parseInt(popularityInput)), temp.getBeginTime(),temp.getEndTime());
    }

}

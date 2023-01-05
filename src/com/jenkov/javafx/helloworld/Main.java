package com.jenkov.javafx.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.ProgressBar;
import javafx.stage.StageStyle;
import javafx.scene.control.DatePicker;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BESTIE");

        Text text = new Text("Meow");

        Label label1 = new Label("HEY BESTIE !");
        Label label2 =  new Label("Fluffy");
        Label label3 = new Label("Ruuf");
        label1.setFont(new Font("arial", 24));
        Button PressMe = new Button("PressMe");

        PressMe.setOnAction(actionEvent ->  {
            PressMe.setText("you did it!");
            PressMe.setTextFill(Paint.valueOf("pink"));
        });

        TextField textfield = new TextField();

        textfield.setText("Type Here");

        TextArea textArea = new TextArea();

        MenuItem menuItem1 = new MenuItem("Cat");
        MenuItem menuItem2 = new MenuItem("Dog");
        MenuItem menuItem3 = new MenuItem("No Pet");

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3);

        menuItem1.setOnAction(actionEvent -> {
                    menuItem1.setText("meow");
                    menuButton.setText("Pick one ");
                }
                );

        menuItem2.setOnAction(actionEvent ->
                        menuItem2.setText("Ruuf")
                );
        menuItem3.setOnAction(actionEvent ->
                menuItem3.setText(":(")
        );

        ColorPicker colorPicker = new ColorPicker();


        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("Choice 1");
        choiceBox.getItems().add("Choice 2");
        choiceBox.getItems().add("Choice 3");

        Slider slider = new Slider(0, 100, 0);
        double value = slider.getValue();
        slider.setMajorTickUnit(8.0);
        slider.setMinorTickCount(3);
        slider.setSnapToTicks(true);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);


        ProgressBar progressBar = new ProgressBar();

        DatePicker datePicker = new DatePicker();

        VBox vbox = new VBox(20,label1, label2,text, textfield, colorPicker, progressBar, datePicker);
        VBox vbox2 = new VBox(label3, PressMe, textArea, choiceBox, slider);
        HBox hbox = new HBox(40,vbox, vbox2, menuButton);

        Scene scene = new Scene(hbox, 1000, 600, Paint.valueOf("pink"));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}

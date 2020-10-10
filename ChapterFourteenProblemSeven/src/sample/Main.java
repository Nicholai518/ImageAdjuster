/*
    Chapter Fourteen Problem Seven
    7. Color Adjuster
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        // Constants for scene
        final double SCENE_WIDTH = 700;
        final double SCENE_HEIGHT = 700;

        // Open a FileChooser  to select a picture
        FileChooser fileChooser = new FileChooser();

        // Store picture data
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        String path = selectedFile.toString();

        //System.out.println(path);
        Image selectedImage = new Image("file:" + path);
        ImageView selectedImageIV = new ImageView(selectedImage);
        selectedImageIV.setFitWidth(250);
        selectedImageIV.setFitHeight(200);

        // Slider Section
        // HUE slider
        Label hueSliderLabel = new Label("Hue: ");
        // Slider bar to control image opacity
        Slider hueSlider = new Slider(0.0, 100.0, 0.0);

        hueSlider.setShowTickMarks(true);       // Shows Ticks
        hueSlider.setShowTickLabels(true);      // Shows tick labels
        hueSlider.setMajorTickUnit(25.0);         // Major Tick every 25 points
        hueSlider.setSnapToTicks(true);         // Slider snaps to major Ticks
        hueSlider.setPrefWidth(500.0);            // Width of slider
        hueSlider.setPrefHeight(500.0);           // height of slider

        hueSlider.valueProperty().addListener((observable, oldValue, newValue)->
        {
            // Field used to change picture qualities
             ColorAdjust hueAdjuster = new ColorAdjust();


            // Find out the value on the slider
            double sliderValue = hueSlider.getValue();

            // Change opacity depending on value
            if(sliderValue == 0.0)
            {
                hueAdjuster.setHue(0.0);
                selectedImageIV.setEffect(hueAdjuster);
            }
            else if (sliderValue == 25.0)
            {
                hueAdjuster.setHue(0.25);
                selectedImageIV.setEffect(hueAdjuster);
            }
            else if (sliderValue == 50.0)
            {
                hueAdjuster.setHue(0.50);
                selectedImageIV.setEffect(hueAdjuster);
            }
            else if (sliderValue == 75.0)
            {
                hueAdjuster.setHue(0.75);
                selectedImageIV.setEffect(hueAdjuster);
            }
            else if (sliderValue == 100.0)
            {
                hueAdjuster.setHue(1.0);
                selectedImageIV.setEffect(hueAdjuster);
            }
        });

        // HUE slider
        Label saturationSliderLabel = new Label("Saturation: ");
        // Slider bar to control image opacity
        Slider saturationSlider = new Slider(0.0, 100.0, 0.0);

        saturationSlider.setShowTickMarks(true);       // Shows Ticks
        saturationSlider.setShowTickLabels(true);      // Shows tick labels
        saturationSlider.setMajorTickUnit(25.0);         // Major Tick every 25 points
        saturationSlider.setSnapToTicks(true);         // Slider snaps to major Ticks
        saturationSlider.setPrefWidth(500.0);            // Width of slider
        saturationSlider.setPrefHeight(500.0);           // height of slider

        saturationSlider.valueProperty().addListener((observable, oldValue, newValue)->
        {
            // Field used to change picture qualities
            ColorAdjust saturationAdjuster = new ColorAdjust();


            // Find out the value on the slider
            double sliderValue = saturationSlider.getValue();

            // Change opacity depending on value
            if(sliderValue == 0.0)
            {
                saturationAdjuster.setSaturation(0.0);
                selectedImageIV.setEffect(saturationAdjuster);
            }
            else if (sliderValue == 25.0)
            {
                saturationAdjuster.setSaturation(0.25);
                selectedImageIV.setEffect(saturationAdjuster);
            }
            else if (sliderValue == 50.0)
            {
                saturationAdjuster.setSaturation(0.50);
                selectedImageIV.setEffect(saturationAdjuster);
            }
            else if (sliderValue == 75.0)
            {
                saturationAdjuster.setSaturation(0.75);
                selectedImageIV.setEffect(saturationAdjuster);
            }
            else if (sliderValue == 100.0)
            {
                saturationAdjuster.setSaturation(1.0);
                selectedImageIV.setEffect(saturationAdjuster);
            }
        });



        // Brightness Slider
        Label brightnessSliderLabel = new Label("Brightness: ");
        // Slider bar to control image opacity
        Slider brightnessSlider = new Slider(0.0, 100.0, 0.0);

        brightnessSlider.setShowTickMarks(true);       // Shows Ticks
        brightnessSlider.setShowTickLabels(true);      // Shows tick labels
        brightnessSlider.setMajorTickUnit(25.0);         // Major Tick every 25 points
        brightnessSlider.setSnapToTicks(true);         // Slider snaps to major Ticks
        brightnessSlider.setPrefWidth(500.0);            // Width of slider
        brightnessSlider.setPrefHeight(500.0);           // height of slider

        brightnessSlider.valueProperty().addListener((observable, oldValue, newValue)->
        {
            // Field used to change picture qualities
            ColorAdjust brightnessAdjuster = new ColorAdjust();


            // Find out the value on the slider
            double sliderValue = brightnessSlider.getValue();

            // Change opacity depending on value
            if(sliderValue == 0.0)
            {
                brightnessAdjuster.setBrightness(0.0);
                selectedImageIV.setEffect(brightnessAdjuster);
            }
            else if (sliderValue == 25.0)
            {
                brightnessAdjuster.setBrightness(0.25);
                selectedImageIV.setEffect(brightnessAdjuster);
            }
            else if (sliderValue == 50.0)
            {
                brightnessAdjuster.setBrightness(0.5);
                selectedImageIV.setEffect(brightnessAdjuster);
            }
            else if (sliderValue == 75.0)
            {
                brightnessAdjuster.setBrightness(0.75);
                selectedImageIV.setEffect(brightnessAdjuster);
            }
            else if (sliderValue == 100.0)
            {
                brightnessAdjuster.setBrightness(1.0);
                selectedImageIV.setEffect(brightnessAdjuster);
            }
        });

        // Contract Slider
        Label contrastSliderLabel = new Label("Contrast: ");
        // Slider bar to control image opacity
        Slider contrastSlider = new Slider(0.0, 100.0, 0.0);

        contrastSlider.setShowTickMarks(true);       // Shows Ticks
        contrastSlider.setShowTickLabels(true);      // Shows tick labels
        contrastSlider.setMajorTickUnit(25.0);         // Major Tick every 25 points
        contrastSlider.setSnapToTicks(true);         // Slider snaps to major Ticks
        contrastSlider.setPrefWidth(500.0);            // Width of slider
        contrastSlider.setPrefHeight(500.0);           // height of slider

        contrastSlider.valueProperty().addListener((observable, oldValue, newValue)->
        {
            // Field used to change picture qualities
            ColorAdjust contrastAdjuster = new ColorAdjust();


            // Find out the value on the slider
            double sliderValue = contrastSlider.getValue();

            // Change opacity depending on value
            if(sliderValue == 0.0)
            {
                contrastAdjuster.setContrast(0.0);
                selectedImageIV.setEffect(contrastAdjuster);
            }
            else if (sliderValue == 25.0)
            {
                contrastAdjuster.setContrast(0.25);
                selectedImageIV.setEffect(contrastAdjuster);
            }
            else if (sliderValue == 50.0)
            {
                contrastAdjuster.setContrast(0.50);
                selectedImageIV.setEffect(contrastAdjuster);
            }
            else if (sliderValue == 75.0)
            {
                contrastAdjuster.setContrast(0.75);
                selectedImageIV.setEffect(contrastAdjuster);
            }
            else if (sliderValue == 100.0)
            {
                contrastAdjuster.setContrast(1.0);
                selectedImageIV.setEffect(contrastAdjuster);
            }
        });


        // Hue Container
        HBox hueSliderHBox = new HBox(10, hueSliderLabel, hueSlider);
        hueSliderHBox.setAlignment(Pos.CENTER);
        hueSliderHBox.setPadding(new Insets(15));

        // Saturation Container
        HBox saturationSliderHBox = new HBox(10, saturationSliderLabel, saturationSlider);
        saturationSliderHBox.setAlignment(Pos.CENTER);
        saturationSliderHBox.setPadding(new Insets(15));


        // Brightness Container
        HBox brightnessSliderHBox = new HBox(10, brightnessSliderLabel, brightnessSlider);
        brightnessSliderHBox.setAlignment(Pos.CENTER);
        brightnessSliderHBox.setPadding(new Insets(15));


        // Contrast Container
        HBox contrastSliderHBox = new HBox(10,contrastSliderLabel, contrastSlider );
        contrastSliderHBox.setAlignment(Pos.CENTER);
        contrastSliderHBox.setPadding(new Insets(15));

        // Picture Container
        HBox pictureHBox = new HBox(10, selectedImageIV);
        pictureHBox.setAlignment(Pos.CENTER);
        pictureHBox.setPadding(new Insets(15));

        VBox fullMenu = new VBox(10, pictureHBox, hueSliderHBox, saturationSliderHBox,brightnessSliderHBox, contrastSliderHBox);
        // Scene
        Scene scene = new Scene(fullMenu, SCENE_WIDTH, SCENE_HEIGHT);
        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChattrBoxTheGreat... Best Editor ever!");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

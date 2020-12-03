//SJSU-CS151
//Name: Duc Huy Nguyen
//Animation.java
//Note: In order for this program to work, I have to download and add javafx library: javafx-sdk-15.0.1 mac version
//Here is the download link if you ever need it: https://gluonhq.com/products/javafx/
//Instruction on how to setup javafx with different IDE: https://openjfx.io/openjfx-docs/#install-javafx

//Note: Even though we don't see the RotateTransition for Sphere because it's a round object,it is still working.
//Other animations are working fine.

import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.PhongMaterial;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.input.* ;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;





public class Animation extends Application{
    private ArrayList<Color> palette = new ArrayList<Color>(Arrays.asList(Color.RED,Color.GREEN,Color.PINK));
    Sphere sphere = new Sphere();
    Cylinder cylinder = new Cylinder();
    Rectangle rectangle = new Rectangle();
    Polygon polygon = new Polygon();


    private RotateTransition sphereRotateTransition(){
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(sphere);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();
        return rotateTransition;
    }

    private ScaleTransition sphereScaleTransition(){
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(sphere);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
        return scaleTransition;
    }

    private void sphereSequentialTransition(){
        SequentialTransition seqT = new SequentialTransition (sphereRotateTransition(),sphereScaleTransition());
        seqT.play();
    }

    private RotateTransition polygonRotateTransition(){
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(polygon);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();
        return rotateTransition;
    }

    private ScaleTransition polygonScaleTransition(){
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(polygon);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
        return scaleTransition;
    }

    private void polygonSequentialTransition(){
        SequentialTransition seqT = new SequentialTransition (polygonRotateTransition(),polygonScaleTransition());
        seqT.play();
    }

    private RotateTransition rectangleRotateTransition(){
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(rectangle);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();
        return rotateTransition;
    }

    private ScaleTransition rectangleScaleTransition(){
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(rectangle);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
        return scaleTransition;
    }

    private void rectangleSequentialTransition(){
        SequentialTransition seqT = new SequentialTransition (rectangleRotateTransition(),rectangleScaleTransition());
        seqT.play();
    }

    private RotateTransition cylinderRotateTransition(){
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(cylinder);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();
        return rotateTransition;
    }

    private ScaleTransition cylinderScaleTransition(){
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(cylinder);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
        return scaleTransition;
    }

    private void cylinderSequentialTransition(){
        SequentialTransition seqT = new SequentialTransition (cylinderRotateTransition(),cylinderScaleTransition());
        seqT.play();
    }

    private void polygonFadeTransition(){
        FadeTransition ft = new FadeTransition(Duration.millis(3000), polygon);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);

        ft.play();
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Sphere
        sphere.setRadius(60.0f);
        PhongMaterial sphereMaterial = new PhongMaterial();
        sphereMaterial.setDiffuseColor(Color.RED);
        sphere.setMaterial(sphereMaterial);
        sphere.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                PhongMaterial phongMaterial = new PhongMaterial();
                phongMaterial.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
                sphere.setMaterial(phongMaterial);
            }
        });

        //Cylinder
        cylinder.setRadius(50.0f);
        cylinder.setHeight(100.0f);
        PhongMaterial cylinderMaterial = new PhongMaterial();
        cylinderMaterial.setDiffuseColor(Color.BLUE);
        cylinder.setMaterial(cylinderMaterial);
        cylinder.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<>() {

            @Override
            public void handle(MouseEvent mouseEvent) {
                PhongMaterial phongMaterial = new PhongMaterial();
                phongMaterial.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
                cylinder.setMaterial(phongMaterial);
            }
        });

        //Rectangle
        rectangle.setWidth(100.0f);
        rectangle.setHeight(120.0f);
        rectangle.setFill(Color.YELLOW);
        rectangle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                rectangle.setFill(palette.get(new Random().nextInt(palette.size())));
            }
        });

        //Polygon
        polygon.getPoints().addAll(150.0,0.0,350.0,0.0,400.0,100.0,350.0,200.0,150.0,200.0,100.0,100.0);
        polygon.setFill(Color.RED);
        polygon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                polygon.setFill(palette.get(new Random().nextInt(palette.size())));
            }
        });

        ChoiceBox<String> cbSphere = new ChoiceBox<>();
        cbSphere.getItems().addAll("Rotate Transition", "Scale Transition", "Sequential Transition");
        ChoiceBox<String> cbCylinder = new ChoiceBox<>();
        cbCylinder.getItems().addAll("Rotate Transition", "Scale Transition", "Sequential Transition");
        ChoiceBox<String> cbPolygon = new ChoiceBox<>();
        cbPolygon.getItems().addAll("Rotate Transition", "Scale Transition", "Sequential Transition","Fade Transition");
        ChoiceBox<String> cbRectangle = new ChoiceBox<>();
        cbRectangle.getItems().addAll("Rotate Transition", "Scale Transition", "Sequential Transition");


        GridPane gridPane = new GridPane();
        gridPane.addRow(0,new Label("Sphere"),new Label("Cylinder"));  //Labels
        gridPane.addRow(1,sphere,cylinder);  //Shapes
        gridPane.addRow(2,cbSphere,cbCylinder); //Choice boxes.
        gridPane.addRow(3,new Label("Rectangle"),new Label("Polygon"));  //Labels
        gridPane.addRow(4,rectangle,polygon); //Shapes
        gridPane.addRow(5,cbRectangle,cbPolygon); //Choice boxes.

        gridPane.setPadding(new Insets(15,15,15,15)); //Adding styles.
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setGridLinesVisible(true); //Gridlines.


        EventHandler<ActionEvent> sphereChoiceBox = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String source = cbSphere.getValue();
                if (source.equals("Rotate Transition")){
                    sphereRotateTransition();
                }
                else if(source.equals("Scale Transition")){
                    sphereScaleTransition();
                }
                else if(source.equals("Sequential Transition")){
                    sphereSequentialTransition();
                }
            }
        };
        cbSphere.setOnAction(sphereChoiceBox);

        EventHandler<ActionEvent> polygonChoiceBox = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String source = cbPolygon.getValue();
                if (source.equals("Rotate Transition")){
                    polygonRotateTransition();
                }
                else if(source.equals("Scale Transition")){
                    polygonScaleTransition();
                }
                else if(source.equals("Sequential Transition")){
                    polygonSequentialTransition();
                }
                else if(source.equals("Fade Transition")) {
                    polygonFadeTransition();
                }
            }
        };
        cbPolygon.setOnAction(polygonChoiceBox);

        EventHandler<ActionEvent> rectangleChoiceBox = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String source = cbRectangle.getValue();
                if (source.equals("Rotate Transition")){
                    rectangleRotateTransition();
                }
                else if(source.equals("Scale Transition")){
                    rectangleScaleTransition();
                }
                else if(source.equals("Sequential Transition")){
                    rectangleSequentialTransition();
                }
            }
        };
        cbRectangle.setOnAction(rectangleChoiceBox);

        EventHandler<ActionEvent> cylinderChoiceBox = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String source = cbCylinder.getValue();
                if (source.equals("Rotate Transition")){
                    cylinderRotateTransition();
                }
                else if(source.equals("Scale Transition")){
                    cylinderScaleTransition();
                }
                else if(source.equals("Sequential Transition")){
                    cylinderSequentialTransition();
                }
            }
        };
        cbCylinder.setOnAction(cylinderChoiceBox);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.setX(500);
        stage.setY(500);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

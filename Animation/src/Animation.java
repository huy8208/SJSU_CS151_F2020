import javafx.event.ActionEvent;
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
import javafx.scene.control.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;



public class Animation extends Application{
    private ArrayList<Color> palette = new ArrayList<Color>(Arrays.asList(Color.RED,Color.GREEN,Color.PINK));

    @Override
    public void start(Stage stage) throws Exception {

        //Sphere
        Sphere sphere = new Sphere();
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
        Cylinder cylinder = new Cylinder();
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

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100.0f);
        rectangle.setHeight(120.0f);
        rectangle.setFill(Color.YELLOW);
        rectangle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                rectangle.setFill(palette.get(new Random().nextInt(palette.size())));
            }
        });

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(150.0,0.0,350.0,0.0,400.0,100.0,350.0,200.0,150.0,200.0,100.0,100.0);
        polygon.setFill(Color.RED);
        polygon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                polygon.setFill(palette.get(new Random().nextInt(palette.size())));
            }
        });


        Button sphereButton = new Button("Animate Sphere");
        Button rectangleButton = new Button("Animate Rectangle");
        Button cyclinderButton = new Button("Animate Cyclinder");
        Button polygonButton = new Button("Animate Polygon");
        GridPane gridPane = new GridPane();
        gridPane.addRow(0,sphere,cylinder);
        gridPane.addRow(1,sphereButton,cyclinderButton);
        gridPane.addRow(2,rectangle,polygon);
        gridPane.addRow(3,rectangleButton,polygonButton);
        gridPane.setPadding(new Insets(15,15,15,15));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setGridLinesVisible(true);


        EventHandler<ActionEvent> buttonClicked = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button source = (Button) actionEvent.getSource();
                if(source == rectangleButton){
                    rectangle.setFill(palette.get(new Random().nextInt(palette.size())));
                }
                else if(source == cyclinderButton){
                    PhongMaterial phongMaterial = new PhongMaterial();
                    phongMaterial.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
                    cylinder.setMaterial(phongMaterial);
                }
                else if(source == polygonButton){
//                    polygon.setFill(palette.get(new Random().nextInt(palette.size())));
                    RotateTransition rotateTransition = new RotateTransition();
                    rotateTransition.setDuration(Duration.millis(1000));
                    rotateTransition.setNode(polygon);
                    rotateTransition.setByAngle(360);
                    rotateTransition.setCycleCount(50);
                    rotateTransition.setAutoReverse(false);
                    rotateTransition.play();
                }
                else if(source == sphereButton){
                    PhongMaterial phongMaterial = new PhongMaterial();
                    phongMaterial.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
                    sphere.setMaterial(phongMaterial);
                }
            }
        };

        rectangleButton.setOnAction(buttonClicked);
        cyclinderButton.setOnAction(buttonClicked);
        sphereButton.setOnAction(buttonClicked);
        polygonButton.setOnAction(buttonClicked);

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

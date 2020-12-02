import javafx.scene.paint.PhongMaterial;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;


public class Animation extends Application{
    private ArrayList<Color> palette = new ArrayList<Color>(Arrays.asList(Color.RED,Color.GREEN,Color.PINK));

    @Override
    public void start(Stage stage) throws Exception {
        Sphere sphere = new Sphere();
        sphere.setRadius(40.0f);
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

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(30.0f);
        cylinder.setHeight(70.0f);
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
        rectangle.setWidth(70.0f);
        rectangle.setHeight(50.0f);
        rectangle.setFill(Color.YELLOW);
        rectangle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                PhongMaterial phongMaterial = new PhongMaterial();
                phongMaterial.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
                cylinder.setMaterial(phongMaterial);
            }
        });

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(0.0,0.0,20.0,20.0,10.0,20.0,10.0,10.0,20.0,10.0);
        polygon.setFill(Color.YELLOW);
        polygon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                polygon.setFill(palette.get(new Random().nextInt(palette.size())));
            }
        });

        FlowPane center = new FlowPane();
        center.setPadding(new Insets(10,10,10,10));
        center.setVgap(5);
        center.setHgap(5);
        center.getChildren().addAll(sphere,rectangle,polygon,cylinder);


        BorderPane root = new BorderPane();
        root.setCenter(center);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setX(300);
        stage.setY(300);
        stage.show();

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(polygon);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(50);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

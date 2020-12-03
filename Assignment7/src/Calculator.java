//SJSU-CS151
//Name: Duc Huy Nguyen
//Calculator.java
//Note: In order for this program to work, I have to download and add javafx library: javafx-sdk-15.0.1 mac version
//Here is the download link if you ever need it: https://gluonhq.com/products/javafx/
//Instruction on how to setup javafx with different IDE: https://openjfx.io/openjfx-docs/#install-javafx

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.*;
import java.util.ArrayList;



public class Calculator extends Application {
    private TextField outputField;
    private ArrayList<Button> listOfButton;
    private Button plusSign;
    private Button minusSign;
    private Button multSign;
    private Button divSign;
    private Button eqSign;
    private String currentOperation;
    private Double firstOperand;



    private void resetValues(){
        this.currentOperation = "";
        this.firstOperand = 0.0;
        outputField.setText("0");
        outputField.setStyle("-fx-text-fill: black");
    }

    @Override
    public void start(Stage stage) {
        currentOperation = "";
        firstOperand = 0.0;

        VBox displayPanel = new VBox(50);
        GridPane buttonPanel = new GridPane();

        //Add outputField's styles
        outputField = new TextField("0");
        outputField.setStyle("-fx-background-color: #FFFFFF;");
        outputField.setAlignment(Pos.CENTER_RIGHT);
        outputField.setPrefWidth(50);

        // Digits
        listOfButton = new ArrayList<>();
        listOfButton.add(new Button("0"));
        listOfButton.add(new Button("1"));
        listOfButton.add(new Button("2"));
        listOfButton.add(new Button("3"));
        listOfButton.add(new Button("4"));
        listOfButton.add(new Button("5"));
        listOfButton.add(new Button("6"));
        listOfButton.add(new Button("7"));
        listOfButton.add(new Button("8"));
        listOfButton.add(new Button("9"));
        listOfButton.add(new Button(".")); //10
        listOfButton.add(new Button("AC")); //11


        // Operation Button
        plusSign = new Button("+") ;
        minusSign = new Button("-");
        multSign =  new Button("*");
        divSign = new Button("/");
        eqSign = new Button("=");
        listOfButton.add(plusSign); //12
        listOfButton.add(minusSign); //13
        listOfButton.add(multSign); //14
        listOfButton.add(divSign); //15
        listOfButton.add(eqSign); //15




        //Adding all buttons to button Panel.
        buttonPanel.setHgap(10);
        buttonPanel.setVgap(10);
        buttonPanel.addRow(0,listOfButton.get(0),listOfButton.get(1),listOfButton.get(2),listOfButton.get(3));
        buttonPanel.addRow(1,listOfButton.get(4),listOfButton.get(5),listOfButton.get(6),listOfButton.get(7));
        buttonPanel.addRow(2,listOfButton.get(8),listOfButton.get(9),listOfButton.get(10),listOfButton.get(11));
        buttonPanel.addRow(3,listOfButton.get(12),listOfButton.get(13),listOfButton.get(14),listOfButton.get(15),listOfButton.get(16));

        //Set size.
        buttonPanel.setMinSize(200,50);
        buttonPanel.setAlignment(Pos.BOTTOM_LEFT);


        for (int i = 0;i <= 9; i++){
            listOfButton.get(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    String currentText = outputField.getText();
                    Object source = (Object) actionEvent.getSource();
                    String newDigit = "";
                    if ((Button)source == listOfButton.get(0)){
                        newDigit = "0";
                    }
                    else if((Button)source == listOfButton.get(1)){
                        newDigit = "1";
                    }
                    else if((Button)source == listOfButton.get(2)){
                        newDigit = "2";
                    }
                    else if((Button)source == listOfButton.get(3)){
                        newDigit = "3";
                    }
                    else if((Button)source == listOfButton.get(4)){
                        newDigit = "4";
                    }
                    else if((Button)source == listOfButton.get(5)){
                        newDigit = "5";
                    }
                    else if((Button)source == listOfButton.get(6)){
                        newDigit = "6";
                    }
                    else if((Button)source == listOfButton.get(7)){
                        newDigit = "7";
                    }
                    else if((Button)source == listOfButton.get(8)){
                        newDigit = "8";
                    }
                    else if((Button)source == listOfButton.get(9)){
                        newDigit = "9";
                    }
                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        //When user click on AC
        listOfButton.get(11).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                resetValues();
            }
        });

        //When user click on dot
        listOfButton.get(10).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = outputField.getText();
                if(!currentText.contains(".")){
                    outputField.setText(currentText+".");
                }
            }
        });

        //Add listeners for operators signs.
        for (int i = 12; i <= 15;i++){
            listOfButton.get(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    Button source = (Button)actionEvent.getSource();
                    if (source == plusSign) {
                        currentOperation = "+";
                    }else if (source == minusSign) {
                        currentOperation = "-";
                    }else if (source == multSign) {
                        currentOperation = "*";
                    }else if (source == divSign) {
                        currentOperation = "/";
                    }

                    String currentText = outputField.getText();
                    try{
                        Double currentTextDouble = new Double(currentText);
                        firstOperand = currentTextDouble;
                        outputField.setText("0");
                    } catch(NumberFormatException e){
                        resetValues();
                    }
                }
            });
        }


        //When user clicks on equal sign
        eqSign.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try{
                    Double secondOperand = new Double(currentText);

                    if(currentOperation.equals("+")){
                        result = firstOperand + secondOperand;
                    } else if(currentOperation.equals("-")){
                        result = firstOperand - secondOperand;
                    } else if(currentOperation.equals("*")){
                        result = firstOperand * secondOperand;
                    } else if(currentOperation.equals("/")){
                        if(secondOperand != 0.0){
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setStyle("-fx-text-fill: red;");
                        }
                    }

                    outputField.setText(Double.toString(result));
                    firstOperand = result;
                } catch(NumberFormatException e){
                    resetValues();
                }
            }
        });


        //Adding displayPanel to Stage and show().
        displayPanel.getChildren().addAll(outputField,buttonPanel);
        Scene scene = new Scene(displayPanel);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

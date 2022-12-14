

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator_11 extends Application {
    private TextField txt;
    private String op="";
    private  long num1=0;    private boolean start=true;
    public void start(Stage stage) throws  Exception{
        txt = new TextField();
        txt.setAlignment(Pos.CENTER_RIGHT);
        txt.setPrefHeight(50);
        txt.setFont(Font.font(20));
        txt.setEditable(false);
        txt.setBackground(Background.fill(Color.TAN));


        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        stackPane.getChildren().add(txt);

        TilePane tilePane = new TilePane();
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setAlignment(Pos.TOP_CENTER);
        tilePane.getChildren().addAll(
                Number("7"), Number("8"), Number("9"), OPeration("/"),
                Number("4"), Number("5"), Number("6"), OPeration("X"),
                Number("1"), Number("2"), Number("3"), OPeration("-"),
                Number("0"), OPeration("+"), OPeration("="), Clear("AC")
        );

        BorderPane root = new BorderPane();
        root.setTop(stackPane);
        root.setCenter(tilePane);
        Scene scene = new Scene(root, 250, 320);
        root.setBackground(Background.fill(Color.BLACK));
        stage.setScene(scene);
        stage.setTitle("calculator");
        stage.show();
    }

    private Button Number(String st) {
        Button button = new Button(st);
        button.setFont(Font.font(18));
        button.setPrefSize(50, 50);
        button.setOnAction(this::processNumber);
        button.setBackground(Background.fill(Color.BLUE));
        button.setTextFill(Color.WHITE);
        return button;

    }


    private Button OPeration(String st) {
        Button button = new Button(st);
        button.setFont(Font.font(20));
        button.setPrefSize(50, 50);
        button.setOnAction(this::OPeration);
        button.setTextFill(Color.BLACK);
        button.setBackground(Background.fill(Color.CYAN));
        return button;
    }


    private Button Clear(String st) {
        Button button = new Button(st);
        button.setFont(Font.font(18));
        button.setPrefSize(50, 50);
        button.setBackground(Background.fill(Color.YELLOW));
        button.setOnAction(e->{
            txt.setText("");
            op="";
            start=true;
        });
        return button;
    }

    private void processNumber(javafx.event.ActionEvent e) {
        if(start){
            txt.setText("");
            start=false;
        }
        String value=((Button) e.getSource()).getText();
        txt.setText(txt.getText()+value);

    }
    private void OPeration(javafx.event.ActionEvent e) {
        String value=((Button) e.getSource()).getText();
        if (!value.equals("=")){
            if(!op.isEmpty())
                return;
            num1= Long.parseLong(txt.getText());
            op=value;
            txt.setText("");
            System.out.println(num1);
            System.out.println(value);

        }
        else {
            if(op.isEmpty())
                return;
            long  num2=Long.parseLong(txt.getText());
            System.out.println(num2);
            float result=  caculate(num1,num2,op);
            txt.setText(String.valueOf(result));
            start=true;
            op="";

        }

    }
    private float caculate(long num1, long num2, String operator){
        switch (operator){
            case "+": return num1+num2;
            case "-":return num1-num2;
            case "X":return num1*num2;
            case "/":
                if (num2==0)
                    return  0;
                return num1/num2;
            default: return 0;


        }

    }
    public static  void  main(String [] args){
        launch(args);
    }
}






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6task2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Did the lab in class, Thursday 16th October 
 * @author 6303129
 */
public class lab6task2 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        
        //rectangle 
        //polygone 
        Rectangle base = new Rectangle(200,350,500,300);
        base.setFill(Color.LIGHTBLUE);
        base.setStroke(Color.DARKBLUE);
        base.setStrokeWidth(3);
        
        
        //use polygone to make the triangle , the roof 
        Polygon roof = new Polygon(200.0,350.0,
                700.0,350.0, 
                450.0, 230.0);
        roof.setFill(Color.SADDLEBROWN);
        roof.setStroke(Color.BROWN);
        roof.setStrokeWidth(3);
      
        //add windows
        Rectangle window1 = new Rectangle(270,600,70,70);
        Rectangle window2 = new Rectangle(550,600,70,70);
        window1.setFill(Color.RED);
        window2.setFill(Color.RED);
        
        //need to add the door
        Rectangle door = new Rectangle(440,470,120,180);
        door.setFill(Color.SIENNA);
        door.setStroke(Color.BLACK);
        door.setStrokeWidth(2);
        
        //add circle for the sun 
        Circle myCircle = new Circle();
        myCircle.setCenterX(900);
        myCircle.setCenterY(50);
        myCircle.setRadius(50);
        myCircle.setFill(Color.YELLOW);
        
        //create chimney
        Rectangle Chimney = new Rectangle(500,400,50,100);
        Chimney.setFill(Color.BLACK);
        
        
        Pane root = new Pane(base, window1,window2,roof, door, myCircle, Chimney);
        Scene scene = new Scene(root, 1000, 1000);
        stage.setScene(scene);
        
        stage.show();
    }
}

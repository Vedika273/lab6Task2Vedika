
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
        Rectangle base = new Rectangle(200,500,500,500);
        base.setFill(Color.BLUE);
        
        
        //use polygone to make the triangle , the roof 
        Polygon triangle = new Polygon(450,350,
                700,500, 
                200, 500);
        triangle.setFill(Color.BROWN);
      
        //add windows
        Rectangle window1 = new Rectangle(270,600,70,70);
        Rectangle window2 = new Rectangle(550,600,70,70);
        window1.setFill(Color.RED);
        window2.setFill(Color.RED);
        
        //need to add the door
        Rectangle door = new Rectangle(400,800,100,800);
        door.setFill(Color.GREEN);
        
        //add circle for the sun 
        Circle myCircle = new Circle();
        myCircle.setCenterX(900);
        myCircle.setCenterY(50);
        myCircle.setRadius(50);
        myCircle.setFill(Color.YELLOW);
        
        //create chimney
        Rectangle Chimney = new Rectangle(500,400,50,100);
        Chimney.setFill(Color.BLACK);
        
        
        Pane root = new Pane(base, window1,window2, triangle, door, myCircle, Chimney);
        Scene scene = new Scene(root, 1000, 1000);
        stage.setScene(scene);
        
        stage.show();
    }
}

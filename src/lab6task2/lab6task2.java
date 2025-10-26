
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
import javafx.scene.shape.Line;
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
        Rectangle base = new Rectangle(200,300,500,300);
        base.setFill(Color.LIGHTBLUE);
        base.setStroke(Color.DARKBLUE);
        base.setStrokeWidth(3);
        
        
        //use polygone to make the triangle , the roof 
        Polygon roof = new Polygon(200.0,300.0,
                700.0,300.0, 
                450.0, 180.0);
        roof.setFill(Color.SADDLEBROWN);
        roof.setStroke(Color.BROWN);
        roof.setStrokeWidth(3);
      
        //add windows
        Rectangle window1 = new Rectangle(260,360,80,80);
        Rectangle window2 = new Rectangle(560,360,80,80);
        window1.setFill(Color.LIGHTYELLOW);
        window2.setFill(Color.LIGHTYELLOW);
        window1.setStroke(Color.DARKBLUE);
        window2.setStroke(Color.DARKBLUE);
        window1.setStrokeWidth(2);
        window2.setStrokeWidth(2);
        
        //add the horizontal window panes
        Line pane1 = new Line(260, 400, 340, 400); // window1 middle line
        Line pane2 = new Line(560, 400, 640, 400); // window2 middle line
        pane1.setStroke(Color.DARKBLUE);
        pane2.setStroke(Color.DARKBLUE);
        pane1.setStrokeWidth(3);
        pane2.setStrokeWidth(3);
        
        //vertical panes 
        // vertical window panes
        Line pane1v = new Line(300, 360, 300, 440); // middle of window1
        Line pane2v = new Line(600, 360, 600, 440); // middle of window2

        pane1v.setStroke(Color.DARKBLUE);
        pane2v.setStroke(Color.DARKBLUE);
        pane1v.setStrokeWidth(3);
        pane2v.setStrokeWidth(3);
        
        //need to add the door
        Rectangle door = new Rectangle(400,420,120,180);
        door.setFill(Color.SIENNA);
        door.setStroke(Color.BLACK);
        door.setStrokeWidth(2);
        
        //add circle for the sun 
        Circle sun = new Circle();
        sun.setCenterX(700);
        sun.setCenterY(90);
        sun.setRadius(45);
        sun.setFill(Color.YELLOW);
        sun.setStroke(Color.ORANGE);
        sun.setStrokeWidth(3);
        
        
        //create chimney
        Rectangle chimney = new Rectangle(560,200,40,80);
        chimney.setFill(Color.GRAY);
        chimney.setStroke(Color.BLACK);
        chimney.setStrokeWidth(2);
       
        //grass
        Rectangle grass = new Rectangle(0,600,950,50);
        grass.setFill(Color.GREEN);
        grass.setStroke(Color.DARKGREEN);
        grass.setStrokeWidth(2);
        
        Pane root = new Pane(grass, base, roof, chimney, window1, window2, door, sun, pane1, pane2,pane1v, pane2v);
        Scene scene = new Scene(root, 950, 650);
        stage.setScene(scene);
        
        stage.show();
    }
}

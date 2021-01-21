/**
 *
 * @author Rohan Khanna
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Scanner;
public class CircularTables extends Application{
    static double[] allRadius = new double[3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<3; i++){
        System.out.println("Enter the radius of circle "+(i+1)+": ");
        allRadius[i] = input.nextDouble();
        }
        Application.launch();
    }
    public void start(Stage primaryStage){
        Pane pane = new Pane(); 
	double paneHeight = 800;
        
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(700,200,allRadius[0] ,Color.WHITE);
        circle[1] = new Circle(615,400,allRadius[1] ,Color.WHITE);
        circle[2] = new Circle(905,350,allRadius[2] ,Color.WHITE);
        
        pane.getChildren().addAll(circle[0], circle[1],circle[2]);
        Scene scene = new Scene(pane, 1500, paneHeight);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("Three Circular Tables");
	primaryStage.setScene(scene);
        primaryStage.show();
    }
}

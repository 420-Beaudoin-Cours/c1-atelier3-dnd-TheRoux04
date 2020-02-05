package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent root;
        primaryStage.setTitle("Hello World");

        Scanner scan = new Scanner(System.in);

        int exercice;
        System.out.print("Entrer un numéro d'exercice: ");
        exercice = scan.nextInt();
        System.out.println();

        switch(exercice) {

            case 1:

                root = FXMLLoader.load(getClass().getResource("Exercice1.fxml"));

                break;

            case 2:

                root = FXMLLoader.load(getClass().getResource("Exercice2.fxml"));

                break;

//            case 3:
//
//                root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//
//                break;
//
//            case 4:
//
//                root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//
//                break;

            default:
                throw new IllegalStateException("Unexpected value: " + exercice);
        }
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

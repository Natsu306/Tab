package sample;

import animatefx.animation.FadeIn;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
     public static Stage me;
    @Override
    public void start(Stage primaryStage) throws Exception{
        me=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login/login.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

        new FadeIn(root).play();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

package sample.cuidados2;

import animatefx.animation.Tada;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sample.Main;

import java.io.IOException;

public class Cuidados2 {
    public void boton9(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../cuidados/Cuidados.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }

}

package sample.cuidados;

import animatefx.animation.Tada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Main;

import java.io.IOException;

public class Cuidados {
    public void boton6(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../principal/principal.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }
    public void boton8(ActionEvent a) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../cuidados2/cuidado2.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }
}

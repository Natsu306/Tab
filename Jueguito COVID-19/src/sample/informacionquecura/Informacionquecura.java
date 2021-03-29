package sample.informacionquecura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Main;

import java.io.IOException;

public class Informacionquecura {
    @FXML Canvas lienzo;
    GraphicsContext context;
    int valor;
    public void boton7(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../principal/principal.fxml"));
        Scene scene = new Scene(root);
        Main.me.setScene(scene);
    }


}

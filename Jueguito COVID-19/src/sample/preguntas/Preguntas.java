package sample.preguntas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import sample.Main;

import java.io.IOException;

public class Preguntas {
    @FXML RadioButton radio1,radio2;
    @FXML ImageView im1,im2;

    public void boton7(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../principal/principal.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }
    public void radio1(ActionEvent e){

            im1.setVisible(true);

    }
    public void radio2(ActionEvent e){
       im2.setVisible(true);
    }
}

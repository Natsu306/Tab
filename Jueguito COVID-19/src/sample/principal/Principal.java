package sample.principal;

import animatefx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import sample.Main;

import java.io.IOException;

public class Principal {
    @FXML AnchorPane anchorpane;
    @FXML StackPane stackPane;
    @FXML Button botiquin,botiquin2,botiquin3,botiquin4,botiquin5;

    public void boton1(ActionEvent e) throws IOException {
        new Tada(botiquin).play();
        Parent root = FXMLLoader.load(getClass().getResource("../informacionquecura/Informacionquecura.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }
    public void boton2(ActionEvent e) throws IOException {
        new Tada(botiquin2).play();
        Parent root = FXMLLoader.load(getClass().getResource("../cuidados/Cuidados.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }
    public void boton3(ActionEvent e) throws IOException {
        new Tada(botiquin3).play();
        Parent root = FXMLLoader.load(getClass().getResource("../preguntas/Preguntas.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);

    }
    public void boton4(ActionEvent e) throws IOException {
        new Tada(botiquin4).play();
        Parent root = FXMLLoader.load(getClass().getResource("../cuidados/Cuidados.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }
    public void boton5(ActionEvent e) throws IOException {
        new Tada(botiquin5).play();
        Parent root = FXMLLoader.load(getClass().getResource("../login/login.fxml"));
        Scene scene=new Scene(root);
        Main.me.setScene(scene);
    }

}

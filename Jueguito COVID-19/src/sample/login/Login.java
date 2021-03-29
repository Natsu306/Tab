package sample.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sample.Main;
import java.io.IOException;

public class Login {
 public void cambiar(ActionEvent e) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("../principal/principal.fxml"));
         Scene scene=new Scene(root);
         Main.me.setScene(scene);

     }
 }


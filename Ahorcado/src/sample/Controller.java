package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.util.Random;

public class Controller {
    @FXML HBox contenedor;
    @FXML AnchorPane papa;
    String[] palabras={"Pelota","Microfono","Libro","telefono","pantalla","teclado"};
    TextField[] arrayTex=null;
    int letraB=0;
    int letrM=0;
    @FXML protected void initialize(){
        Random random=new Random();
        int aletario=random.nextInt(6);
        String palabra=palabras[aletario];
        System.out.println(palabra);
        arrayTex=new TextField[palabra.length()];
        int ayuda=2;//letras de ayuda

        for (int x=0;x<palabra.length();x++) {
            arrayTex[x] = new TextField();
            arrayTex[x].setPrefWidth(50);
            arrayTex[x].setPrefHeight(50);
            arrayTex[x].setId("txt-"+x+"-"+palabra.charAt(x));
            arrayTex[x].setOnKeyReleased(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    TextField textField=(TextField) event.getTarget();
                    String[] nombre= textField.getId().split("-");
                    if(nombre[2].equals(textField.getText())) {
                        System.out.println("Correcto" + textField.getId());
                        textField.setDisable(true);
                        letraB++;
                        if(letraB==palabra.length());
                    }else{
                        System.out.println("Incorrecto"+ textField.getId());
                        textField.setText("");
                        letrM++;
                        if (letrM==1){
                            cabeza();
                        }else if(letrM==2){
                            brazodr();
                        }else if(letrM==3){
                            brazoiz();
                        }else if(letrM==4){
                            cuerpo();
                        }else if(letrM==5){
                            piernda1();
                        }else if(letrM==6){
                            perina2();

                            textField.setDisable(true);
                        }
                    }
                }
            });
            contenedor.getChildren().add(arrayTex[x]);

        }}
        public void cabeza(){
            ImageView cabeza=new ImageView(new Image("sample/imge/Cabeza.png"));
            papa.getChildren().addAll(cabeza);
            cabeza.setFitWidth(70);
            cabeza.setFitHeight(70);
            cabeza.setLayoutY(150);
            cabeza.setLayoutX(200);
    }
    public void brazodr(){
        ImageView brazodr=new ImageView(new Image("sample/imge/brazo.png"));
        brazodr.setFitWidth(70);
        brazodr.setFitHeight(70);
        brazodr.setLayoutY(250);
        brazodr.setLayoutX(150);
        papa.getChildren().add(brazodr);
    }
    public void brazoiz(){
        ImageView brazoiz=new ImageView(new Image("sample/imge/brazo 2.png"));
        brazoiz.setFitWidth(70);
        brazoiz.setFitHeight(70);
        brazoiz.setLayoutY(250);
        brazoiz.setLayoutX(250);
        papa.getChildren().add(brazoiz);
    }
    public void cuerpo(){
        ImageView cuerpo=new ImageView(new Image("sample/imge/pecho.png"));
        cuerpo.setFitWidth(70);
        cuerpo.setFitHeight(70);
        cuerpo.setLayoutY(250);
        cuerpo.setLayoutX(200);
        papa.getChildren().add(cuerpo);
    }
    public void piernda1(){
        ImageView piernda1=new ImageView(new Image("sample/imge/pieran 1.png"));
        piernda1.setFitWidth(70);
        piernda1.setFitHeight(70);
        piernda1.setLayoutY(350);
        piernda1.setLayoutX(150);
        papa.getChildren().add(piernda1);
    }
    public void perina2(){
        ImageView pierna2=new ImageView(new Image("sample/imge/pierna 2.png"));
        pierna2.setFitWidth(70);
        pierna2.setFitHeight(70);
        pierna2.setLayoutY(350);
        pierna2.setLayoutX(250);
        papa.getChildren().add(pierna2);
    }
}

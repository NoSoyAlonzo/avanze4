package emails.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import java.util.ResourceBundle;
import java.net.URL;

public class controladorTablero implements Initializable {

    @FXML
    private GridPane PanelJuego;
    //tamabnio tempral del tablero

    private static final int Tam_tablero = 10;
    private static final int Espacio = 50;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dibujarTablero();
    }

    //Metodos para interactuar con el tablero
    public void dibujarTablero() {
        // dibujar puntos
        for (int fila = 0; fila < Tam_tablero; fila++) {

            for (int col = 0; col < Tam_tablero; col++) {
                //radio del punto
                Circle punto = new Circle(5);
                punto.setCenterX(col * Espacio);
                punto.setCenterY(fila * Espacio);
                PanelJuego.add(punto,col*2,fila*2);
            }
        }
        //Dibujar Linea Horizontal
        for (int fila = 0; fila < Tam_tablero; fila++) {
            for (int col = 0; col < Tam_tablero - 1; col++) {
                Line lineaHorizontal = new Line(0,0,Espacio,0);
                lineaHorizontal.setStrokeWidth(2);
                lineaHorizontal.setStroke(Color.GRAY); // Color de la línea
                hacerLineaInteactiva(lineaHorizontal); // Hacer la línea interactiva
                PanelJuego.add(lineaHorizontal,col*2+1,fila*2);

            }


        }
        //dibujar Linea Vertical
        for(int fila = 0; fila < Tam_tablero; fila++){
            for (int col = 0; col < Tam_tablero - 1; col++) {
                Line lineaVertical=new Line(0,0,0,Espacio);
                lineaVertical.setStrokeWidth(2);
                lineaVertical.setStroke(Color.GRAY); // Color de la línea
                hacerLineaInteactiva(lineaVertical); // Hacer la línea interactiva
                PanelJuego.add(lineaVertical,col*2+1,fila*2);

            }
        }

    }

    private  void hacerLineaInteactiva(Line linea){


        linea.setOnMouseClicked(event ->{
            if(linea.getStroke()== Color.GRAY){
                linea.setStroke(Color.BLUE);
                System.out.println("Línea reclamada!");
            }

       } );
    }


}
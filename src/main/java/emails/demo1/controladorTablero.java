package emails.demo1;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class controladorTablero {

    @FXML
    private GridPane PanelJuego;
    //tamabnio tempral del tablero

    private static final int Tam_tablero = 10;
    private static final int Espacio = 50;

    //Metodos para interactuar con el tablero
    public void dibujarTablero() {
        //puntos
        for (int fila = 0; fila < Tam_tablero; fila++) {

            for (int columna = 0; columna < Tam_tablero; columna++) {
                //radio del punto
                Circle punto = new Circle(5);
                punto.setCenterX(columna * Espacio);
                punto.setCenterY(fila * Espacio);
                PanelJuego.getChildren().add(punto);
            }
        }

        for (int fila = 0; fila < Tam_tablero; fila++) {
            for (int columna = 0; columna < Tam_tablero - 1; columna++) {
                Line linea = new Line(
                        columna * Espacio, fila * Espacio, // Inicio
                        (columna + 1) * Espacio, fila * Espacio // Fin
                );
                linea.setStrokeWidth(2);
                PanelJuego.getChildren().add(linea);

            }


        }

    }
}
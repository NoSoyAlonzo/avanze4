package emails.demo1.Modelo;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class ModeloTablero {

    public static int Tam_tablero=20;
    public static int Espacio=50;
    private GridPane panelJuego;

    public void dibujarTablero(GridPane panelJuego) {
        // Limpiar el panel antes de dibujar
        panelJuego.getChildren().clear();

        // Dibujar Puntos para el tablero
        for (int columna = 0; columna < Tam_tablero; columna++) {
            for (int fila = 0; fila < Tam_tablero; fila++) {
                Circle circulo = new Circle(5); // Radio del círculo
                circulo.setFill(Color.BLACK);   // Color del círculo
                panelJuego.add(circulo, columna * 2, fila * 2); // Posicionar en el GridPane
            }
        }

        // Dibujar Líneas Horizontales
        for (int columna = 0; columna < Tam_tablero - 1; columna++) {
            for (int fila = 0; fila < Tam_tablero; fila++) {
                Line linea = new Line(0, 0, Espacio, 0); // Línea horizontal
                linea.setStroke(Color.GRAY);             // Color de la línea
                panelJuego.add(linea, columna * 2 + 1, fila * 2); // Posicionar en el GridPane
                GridPane.setColumnSpan(linea, 2); // Hacer que la línea ocupe dos columnas
            }
        }

        // Dibujar Líneas Verticales
        for (int columna = 0; columna < Tam_tablero; columna++) {
            for (int fila = 0; fila < Tam_tablero - 1; fila++) {
                Line linea = new Line(0, 0, 0, Espacio); // Línea vertical
                linea.setStroke(Color.GRAY);              // Color de la línea
                panelJuego.add(linea, columna * 2, fila * 2 + 1); // Posicionar en el GridPane
                GridPane.setRowSpan(linea, 2); // Hacer que la línea ocupe dos filas
            }
        }

        // Ajustar el tamaño del GridPane
        panelJuego.setHgap(Espacio / 2); // Espacio horizontal entre columnas
        panelJuego.setVgap(Espacio / 2); // Espacio vertical entre filas
    }
    private void lineaInteractiva(Line lienaI){

        lienaI.setOnMouseClicked(mouseEvent -> {
            if(lienaI.getStroke()== Color.GRAY){
                lienaI.setStroke(Color.RED);
                System.out.println("Linea Seleccionada");

            }
                });


    }


}

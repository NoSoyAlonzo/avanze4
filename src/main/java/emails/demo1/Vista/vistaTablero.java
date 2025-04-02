package emails.demo1.Vista;
import emails.demo1.Modelo.ModeloTablero;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.util.ResourceBundle;
import java.net.URL;

public class vistaTablero implements Initializable {

    @FXML
    private GridPane PanelJuego;
    //tamano temporal del tablero
    ModeloTablero modelo=new ModeloTablero();
    private static final int Tam_tablero = 10;
    private static final int Espacio = 50;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        modelo.dibujarTablero(PanelJuego);
    }


}
package emails.demo1.Vista;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class vistaMenuColores {

    @FXML
    private ToggleButton BtnAmarillo;

    @FXML
    private ToggleButton BtnAzul;

    @FXML
    private ToggleButton BtnGris;

    @FXML
    private ToggleButton BtnMorado;

    @FXML
    private ToggleButton BtnNegro;

    @FXML
    private ToggleButton BtnRojo;

    @FXML
    private ToggleButton BtnSiguiente;

    @FXML
    private ToggleButton BtnVerde;


    @FXML
    void CancelarB(ActionEvent event) {

    }

    @FXML
    void SiguienteF(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/emails/demo1/LobbyJ.fxml"));
            Parent root = loader.load();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(escena);
            stage.showAndWait();
            stage.setOnCloseRequest(e -> Platform.exit());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //Botones para elegir el color seleccionado
    @FXML
    void seleccionColorAmarillo(ActionEvent event) {
        BtnAmarillo = (ToggleButton) event.getSource();

        String name=BtnAmarillo.getId().toString();

        if(name.equalsIgnoreCase("toggleDC1")) {
            //do something
        }
    }

    @FXML
    void seleccionColorAzul(ActionEvent event) {

    }

    @FXML
    void seleccionColorGris(ActionEvent event) {

    }

    @FXML
    void seleccionColorMorado(ActionEvent event) {

    }

    @FXML
    void seleccionColorNegro(ActionEvent event) {

    }

    @FXML
    void seleccionColorRojo(ActionEvent event) {

    }

    @FXML
    void seleccionColorVerde(ActionEvent event) {

    }

}

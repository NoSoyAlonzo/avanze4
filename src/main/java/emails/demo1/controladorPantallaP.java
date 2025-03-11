package emails.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class controladorPantallaP {

    @FXML
    private Button Btn_CrearP;

    @FXML
    private Button Btn_UnirseP;

    @FXML
    private Button Btn_salir;

    @FXML
    void AbrirCrearP(ActionEvent event) {

    }

    @FXML
    void Btn_salir(ActionEvent event) {

    }

    @FXML
    void UnirsePartida(ActionEvent event) {

            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/emails/demo1/PantallaSeleccionarColor.fxml"));
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

        Platform.exit();
    }

}

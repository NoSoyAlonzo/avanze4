package emails.demo1.Vista;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class vistaLobby {

    @FXML
    private ImageView Imagenj1;

    @FXML
    private ToggleButton TG10;

    @FXML
    private ToggleButton TG40;

    @FXML
    private ToggleButton Tg20;

    @FXML
    private Button btnListo;

    @FXML
    private ImageView imagenj2;

    @FXML
    private ImageView imagenj3;

    @FXML
    void BtnEmpezarJuego(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/emails/demo1/Tablero.fxml"));
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

}

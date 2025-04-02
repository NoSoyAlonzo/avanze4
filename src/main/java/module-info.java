module emails.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens emails.demo1 to javafx.fxml;
    exports emails.demo1;
    exports emails.demo1.Controlador;
    opens emails.demo1.Controlador to javafx.fxml;
    exports emails.demo1.Modelo;
    opens emails.demo1.Modelo to javafx.fxml;
}
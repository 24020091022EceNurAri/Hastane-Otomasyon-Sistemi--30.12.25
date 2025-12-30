module com.ecenur.hastanesistemi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ecenur.hastanesistemi.controller to javafx.fxml;
    opens com.ecenur.hastanesistemi.model to javafx.base;

    exports com.ecenur.hastanesistemi;
}
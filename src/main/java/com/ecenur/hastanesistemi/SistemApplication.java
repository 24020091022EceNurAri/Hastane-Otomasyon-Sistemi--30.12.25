package com.ecenur.hastanesistemi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SistemApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(SistemApplication.class.getResource("login-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Hastane Giriş Sistemi");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
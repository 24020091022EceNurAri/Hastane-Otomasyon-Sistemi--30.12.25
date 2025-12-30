package com.ecenur.hastanesistemi.controller;

import com.ecenur.hastanesistemi.model.Randevu;
import com.ecenur.hastanesistemi.model.Veri;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;

public class HastaneController {
    @FXML private TableView<Randevu> tabloHastalar;
    @FXML private TableColumn<Randevu, String> colTc, colAd, colTarih;
    @FXML private Label lblDoktorAdi;

    @FXML
    public void initialize() {
        colTc.setCellValueFactory(new PropertyValueFactory<>("hastaTc"));
        colAd.setCellValueFactory(new PropertyValueFactory<>("doktorAd"));
        colTarih.setCellValueFactory(new PropertyValueFactory<>("tarih"));

        if (LoginController.girisYapanDoktor != null) {
            String drName = LoginController.girisYapanDoktor.getAdSoyad().trim();
            lblDoktorAdi.setText("Hoş geldiniz, " + drName);

            ObservableList<Randevu> filtreli = FXCollections.observableArrayList();
            for (Randevu r : Veri.tumRandevular) {

                if (r.getDoktorAd().trim().equals(drName)) {
                    filtreli.add(r);
                }
            }
            tabloHastalar.setItems(filtreli);
        }
    }

    @FXML
    void geriGit() throws IOException {
        Stage s = (Stage) tabloHastalar.getScene().getWindow();
        s.setScene(new Scene(new FXMLLoader(getClass().getResource("/com/ecenur/hastanesistemi/login-view.fxml")).load()));
    }
}
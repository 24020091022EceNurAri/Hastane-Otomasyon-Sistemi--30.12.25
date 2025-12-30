package com.ecenur.hastanesistemi.controller;

import com.ecenur.hastanesistemi.model.Doktor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.*;

public class LoginController {
    @FXML private TextField txtLoginTc;
    @FXML private PasswordField pswLoginSifre;
    public static String girenHastaTc;
    public static Doktor girisYapanDoktor;
    private static List<Doktor> doktorListesi = new ArrayList<>();

    static {
        doktorListesi.add(new Doktor("111", "Dr. Ahmet (Dahiliye)", "Dahiliye", "111"));
        doktorListesi.add(new Doktor("222", "Dr. Ayşe (Göz)", "Göz Hastalıkları", "222"));
        doktorListesi.add(new Doktor("333", "Dr. Mehmet (Kardiyoloji)", "Kardiyoloji", "333"));
        doktorListesi.add(new Doktor("444", "Dr. Fatma (Nöroloji)", "Nöroloji", "444"));
        doktorListesi.add(new Doktor("555", "Dr. Ali (KBB)", "Kulak Burun Boğaz", "555"));
    }

    @FXML
    void doktorGirisYap() throws IOException {
        for (Doktor d : doktorListesi) {
            if (d.getTcNo().equals(txtLoginTc.getText()) && d.getSifre().equals(pswLoginSifre.getText())) {
                girisYapanDoktor = d;
                ekranDegistir("doktor-yonetim.fxml", "Doktor Paneli");
                return;
            }
        }
        new Alert(Alert.AlertType.ERROR, "Hatalı Giriş!").show();
    }

    @FXML
    void hastaGirisYap() throws IOException {
        if (!txtLoginTc.getText().isEmpty()) {
            girenHastaTc = txtLoginTc.getText();
            ekranDegistir("hasta-randevu.fxml", "Randevu Sistemi");
        }
    }

    private void ekranDegistir(String fxml, String baslik) throws IOException {
        Stage stage = (Stage) txtLoginTc.getScene().getWindow();
        stage.setScene(new Scene(new FXMLLoader(getClass().getResource("/com/ecenur/hastanesistemi/" + fxml)).load()));
        stage.setTitle(baslik);
    }
}
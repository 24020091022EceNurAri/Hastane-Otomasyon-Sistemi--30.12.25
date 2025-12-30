package com.ecenur.hastanesistemi.controller;

import com.ecenur.hastanesistemi.model.Randevu;
import com.ecenur.hastanesistemi.model.Veri;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;

public class RandevuController {
    @FXML private TextField textAd;
    @FXML private ComboBox<String> comboBolum, comboDoktorlar, comboSaat;
    @FXML private DatePicker dateRandevu;
    @FXML private Label lblMesaj;

    @FXML
    public void initialize() {
        comboBolum.setItems(FXCollections.observableArrayList("Dahiliye", "Göz Hastalıkları", "Kardiyoloji", "Nöroloji", "KBB"));
        comboSaat.setItems(FXCollections.observableArrayList("09:00", "10:00", "11:00", "14:00"));

        comboBolum.setOnAction(e -> {
            comboDoktorlar.getItems().clear();
            String b = comboBolum.getValue();
            if (b.equals("Dahiliye")) comboDoktorlar.getItems().add("Dr. Ahmet (Dahiliye)");
            else if (b.equals("Göz Hastalıkları")) comboDoktorlar.getItems().add("Dr. Ayşe (Göz)");
            else if (b.equals("Kardiyoloji")) comboDoktorlar.getItems().add("Dr. Mehmet (Kardiyoloji)");
            else if (b.equals("Nöroloji")) comboDoktorlar.getItems().add("Dr. Fatma (Nöroloji)");
            else if (b.equals("KBB")) comboDoktorlar.getItems().add("Dr. Ali (KBB)");
        });
    }

    @FXML
    void randevuOlustur() {
        if (comboDoktorlar.getValue() == null || dateRandevu.getValue() == null) return;

        Randevu yeni = new Randevu(LoginController.girenHastaTc, comboDoktorlar.getValue(), dateRandevu.getValue().toString(), comboSaat.getValue());
        Veri.tumRandevular.add(yeni);

        lblMesaj.setText("Randevu Oluşturuldu!");
        lblMesaj.setTextFill(Color.GREEN);
    }

    @FXML
    void geriGit() throws IOException {
        Stage s = (Stage) textAd.getScene().getWindow();
        s.setScene(new Scene(new FXMLLoader(getClass().getResource("/com/ecenur/hastanesistemi/login-view.fxml")).load()));
    }
}
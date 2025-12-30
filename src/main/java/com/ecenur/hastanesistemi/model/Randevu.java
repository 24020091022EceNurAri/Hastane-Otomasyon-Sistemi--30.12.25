package com.ecenur.hastanesistemi.model;

public class Randevu {
    private String hastaTc;
    private String doktorAd;
    private String tarih;
    private String saat;

    public Randevu(String hastaTc, String doktorAd, String tarih, String saat){
        this.hastaTc = hastaTc;
        this.doktorAd = doktorAd;
        this.tarih = tarih;
        this.saat = saat;
    }

    public String getHastaTc() { return hastaTc; }
    public void setHastaTc(String hastaTc) { this.hastaTc = hastaTc; }

    public String getDoktorAd() { return doktorAd; }
    public void setDoktorAd(String doktorAd) { this.doktorAd = doktorAd; }

    public String getTarih() { return tarih; }
    public void setTarih(String tarih) { this.tarih = tarih; }

    public String getSaat() { return saat; }
    public void setSaat(String saat) { this.saat = saat; }
}

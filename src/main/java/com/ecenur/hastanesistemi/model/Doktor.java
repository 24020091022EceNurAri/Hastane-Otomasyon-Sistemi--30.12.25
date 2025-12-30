package com.ecenur.hastanesistemi.model;

public class Doktor {
    private String tcNo;
    private String adSoyad;
    private String brans;
    private String sifre;

    public Doktor(String tcNo, String adSoyad, String brans, String sifre){
        this.tcNo = tcNo;
        this.adSoyad = adSoyad;
        this.brans = brans;
        this.sifre = sifre;
    }

    public String getTcNo() { return tcNo; }
    public void setTcNo(String tcNo) { this.tcNo = tcNo; }

    public String getAdSoyad() { return adSoyad; }
    public void setAdSoyad(String adSoyad) { this.adSoyad = adSoyad; }

    public String getBrans() { return brans; }
    public void setBrans(String brans) { this.brans = brans; }

    public String getSifre() { return sifre; }
    public void setSifre(String sifre) { this.sifre = sifre; }
}

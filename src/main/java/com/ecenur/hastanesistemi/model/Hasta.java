package com.ecenur.hastanesistemi.model;

public class Hasta {
    private String tcNo;
    private String adSoyad;
    private String sifre;

    public Hasta(String tcNo, String adSoyad, String sifre) {
        this.tcNo = tcNo;
        this.adSoyad = adSoyad;
        this.sifre = sifre;
    }

    public String getTcNo() { return tcNo; }
    public void setTcNo(String tcNo) { this.tcNo = tcNo; }

    public String getAdSoyad() { return adSoyad; }
    public void setAdSoyad(String adSoyad) { this.adSoyad = adSoyad; }

    public String getSifre() { return sifre; }
    public void setSifre(String sifre) { this.sifre = sifre; }
}
package com.bilgeadam.ornek;

public class Kişi {

    private int no;
    private String ad;
    private String soyad;
    private double maas;

    public Kişi() {
    }

    public Kişi(int no, String ad, String soyad, double maas) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    public double yıllık_maas_getir()
    {
        double yillik_mass=this.maas *12;
        return yillik_mass;
    }
    public String adSoyadGetir()
    {
        return this.ad+" "+this.soyad;
    }

    @Override
    public String toString() {
        return "Kişi{" +
                "no=" + no +
                ", ad=" + ad +
                ", soyad=" + soyad +
                ", maas=" + maas +
                ",Yıllık Mass"+yıllık_maas_getir()+
                ",Ad Soyad:"+adSoyadGetir() +
                '}';
    }
}

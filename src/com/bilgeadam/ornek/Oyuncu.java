package com.bilgeadam.ornek;

public class Oyuncu {
    //static tanımlanirsa class vabiable'dır.
    //bir obje değeri değiştirirse,
    //diğer objelerde değişen değeri görür.

    //staticdemezsek instance variable 'dır.
    //her obje değişkenlerin ilk değerleriyle başlar.
    //örnek int ise sıfır değeriyle başlar her obje için
    //bir objein değişkende yaptığı değişikliği ,
    //diğer objeler görmez.


    private  int sayac;

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    private int no;
    private String ad;
    private  String soyad;

    public Oyuncu() {
        sayac=sayac +1;
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
}

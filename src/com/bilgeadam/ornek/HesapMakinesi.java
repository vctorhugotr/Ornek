package com.bilgeadam.ornek;

public class HesapMakinesi {

    public int topla(int sayi1, int sayi2)
    {
        return sayi1+sayi2;
    }

    public int carp(int sayi1, int sayi2)
    {

        return sayi1*sayi2;
    }
    public double bol(int sayi1, int sayi2)
    {

        return sayi1/ (double)sayi2;
    }

        public int cikar(int sayi1, int sayi2)

    {

        return sayi1-sayi2;
    }

    public static void main(String[] args) {
    HesapMakinesi hm=new HesapMakinesi();
    System.out.println(hm.topla(5,7));
    System.out.println(hm.carp(5,7));
    System.out.println(hm.bol(8,6));
    System.out.println(hm.cikar(15,7));

    int sonuc=hm.topla(9,14);
    System.out.println("sonuç:"+sonuc);
    }

}

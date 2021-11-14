package com.bilgeadam.ornek;

public class StaticDeneme {
    //ınstance variable
   int sayi1;

   //class variable -değişken static ise class variable'dır.
   static int sayi2;

    public static void main(String[] args) {
        //static olmayan değişkenler,static metoddan erişilemez.
        //Erişmek istitorsak, class'ın kendi objesini
        //oluşturarak erişeceğiz


        //localvariable 'ı biz initialize etmek zorundayız,
        //yani ilk değer verme zorundayız,
        int sayi3=0;
        StaticDeneme sd=new StaticDeneme();


        System.out.println("sayi1:"+sd.sayi1);
        System.out.println("sayı2:"+sayi2);
        System.out.println("sayı3:"+sayi3);
    }


}

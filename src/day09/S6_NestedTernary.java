package day09;

import java.util.Scanner;

public class S6_NestedTernary {
    public static void main(String[] args) {
        // Kullnicidan dikdortgenin uzunlugunu ve genisligini aliniz girilen
        // degerlere gore kare olup olmadigini yazdiriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("ikitane rakam yaizniz");
        int a = scn.nextInt();
        int b = scn.nextInt();

        String sonuc = a==b ? "Karedir":"Dikdortgendir";
        System.out.println(sonuc);


        // ama negatif girme olasili bulundugu ve 0 girme olasiligi oldugu icin

        String sonuc2 = (a>0 && b>0) ?(a==b ? "Kare" : "Dikdortgen") : ("yanlis deger ler girdiniz");
        System.out.println(sonuc2);





    }
}

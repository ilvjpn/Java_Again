package day10;

import java.util.Scanner;

public class S1_NestedIf {
    public static void main(String[] args) {
        //Kullanicidan sayi alin  ve sayi 3 basmakli ise "Uc Basamakli" yoksa "Uc basamakli degil yazdiriniz";

        Scanner scn = new Scanner(System.in);
        System.out.println("3 Basamakli sayi giriniz");
        int sayi = scn.nextInt();


        String sonuc = (sayi>0)? (sayi>=100 && sayi<1000 ? "uc basamakli sayi girdiniz":"uc basamkli sayi degildir"):("eksi deger Gridiniz");
        System.out.println(sonuc);
    }
}

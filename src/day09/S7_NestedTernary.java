package day09;

import java.util.Scanner;

public class S7_NestedTernary {

    public static void main(String[] args) {

        // kullanicindan bir harf isteyiniz kucuk harf ise consola "Kucuk Harf"
        //buyuk har ise "buyuk harf" yoksa "harf giriniz" Yazdiriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("harf Giriniz");
        char ilk = scn.next().charAt(0);

        System.out.println((ilk>='A'&& ilk<='Z'||ilk>='a'&& ilk<='b') ? (ilk>='A'&& ilk<='Z'?"buyuk Harf Giridiniz" :"Kucuk Harf Gridiniz")
                                                  :("Yanlis Girdiniz") );



    }
}

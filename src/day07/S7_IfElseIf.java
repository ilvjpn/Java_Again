package day07;

import java.util.Scanner;

public class S7_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyiniz sayilarin ikide pozitif ise toplamini
        // sayilardan ikiside negatif ise carpimini
        //biri negatif digeri pozotof ise "farkli isaretlerde sayilarlar islem yapamazsin"
        // sifir varsa "yutan elemandir yazdiriniz"

        Scanner scn = new Scanner(System.in);
        System.out.println("iki tane sayi griniz");
        double s = scn.nextDouble();
        double b = scn.nextDouble();

        if (s>0 && b >0) {
            System.out.println(s+b);

        }else if (s<0 && b <0){
            System.out.println(s*b);
        }else if (s<0 && b>0 || s>0 && b<0){
            System.out.println("bu olamaz");
        } else if (s==0 || b==0){
            System.out.println("yutan elemandir");
        }


    }
}

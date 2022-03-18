package day07;

import java.util.Scanner;

public class S1_IfElse {
    public static void main(String[] args) {
        // kullanicindan bir tam sayi isteyiniz
        //sayi pozitif ise  "sayi pozitiftir"
        //sayi 100den kucuk ise "kucuk sayi"
        // sayi 100den buyuk ise "buyuk sayi"

        Scanner scn = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scn.nextInt();

        if (sayi>0) {
            System.out.println("sayi pozitiftir");


        }if (sayi>1000) {
            System.out.println("sayi buyuktur");


        }if (sayi<100) {
            System.out.println("sayi kucuktur");


        }




    }
}

package day10;

import java.util.Scanner;

public class S2_SwitchCase {
    public static void main(String[] args) {

        // kullanicidan 1 rakam isteyin girilen rakamin yazi ile yazdiriniz

        // Switch'te LONG DOUBLE FLOAT BOOLEAN olamazz


        Scanner scn = new Scanner(System.in);
        System.out.println("rakam griniz");
        int rakam = scn.nextInt();

        switch (rakam) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki"); break;
            case 3:
                System.out.println("uc");break;
            case 4:
                System.out.println("dort");break;
            case 5:
                System.out.println("bes");break;
            case 6:
                System.out.println("alti");break;
            case 7:
                System.out.println("yedi");break;
            case 8:
                System.out.println("sekiz");break;
            case 9:
                System.out.println("dokuz");break;
            case 0:
                System.out.println("sifir");break;
            default:
                System.out.println("gecerli deger giriniz");
        }



    }
}

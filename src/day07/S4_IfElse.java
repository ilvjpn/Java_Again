package day07;

import java.util.Scanner;

public class S4_IfElse {
    public static void main(String[] args) {

        // kullanicidan yasini sorun 65 den buyuk ise emekli olursun
        // yoksa emekli olmazsin

        Scanner scn = new Scanner(System.in);
        System.out.println("yasinizi griniz");
        int yas = scn.nextInt();

        if (yas >=65) {
            System.out.println("emekli olabilirisn");


        }else{
            System.out.println("emekli olmazsin");
        }

              scn.close();
    }
}

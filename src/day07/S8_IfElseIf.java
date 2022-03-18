package day07;

import java.util.Scanner;

public class S8_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan maas'ini isteyiniz
        // Teklif 80.000 uzerinde ise kabul ediyorum
        // 60-80.000 arasinda ise konusabiliriz
        //60.000 altinda ise kabul etmiyoru,
        Scanner scn = new Scanner(System.in);
        System.out.println("istenilen teklifi giriniz");
        double a = scn.nextDouble();



        if (a<=0){
            System.out.println("yanlis girdiniz");

        }else if (a>80000){
            System.out.println("kabul ediyorum");
        }else if (a>60000){
            System.out.println("konusuruz");
        }else {
            System.out.println("kabul etmiyorum");

        }


    }
}

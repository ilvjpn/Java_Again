package day06;

import java.util.Scanner;

public class S5_ifStatement {
    public static void main(String[] args) {

        // Kullanicidan bir diktorgen uzunlugu alin
        //kenar uzunluklari esit ise "kare"
        // esit degitse diktorgen yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if (a>0&&b>0&&a == b) {
            System.out.println("karedir");
        }else if (a>0&&b>0&&a!=b) {   System.out.println("diktorgendir");


        }else{
            System.out.println("yanlis girdiniz");
        }


    }
}

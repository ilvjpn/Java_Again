package day09;

import java.util.Scanner;

public class S5_Ternary {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("sayi yaziniz");
        int sayi = scn.nextInt();

        System.out.println (sayi<0 ? (sayi * sayi) : ("pozitif sayi "));

    }
}

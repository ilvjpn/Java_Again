package day09;

import java.util.Scanner;

public class S3_Ternary {
    public static void main(String[] args) {
        // Kullaicindan sayi aliniz ve buyuk olani yazdriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("sayi griniz");
        int a = scn.nextInt();
        int b = scn.nextInt();

        int buyuk = a>b ? a:b;
        System.out.println(buyuk);
    }
}

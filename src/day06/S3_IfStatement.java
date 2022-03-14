package day06;

import java.util.Locale;
import java.util.Scanner;

public class S3_IfStatement {
    public static void main(String[] args) {
        // kullanicidan gum isiminin ilk harfini isteyin ve o harfe uygun gun ismini yaziniz

        Scanner scn = new Scanner(System.in);
        System.out.println("Harf Giriniz");
        char harf = scn.next().toUpperCase().charAt(0);
        System.out.println(harf);

        if (harf == 'P'|| harf =='p') {
            System.out.println("pazartesi veya pazar veya persembe");

        }
        else if (harf == 's'||harf=='S') {
            System.out.println("sali");

        }

        else if (harf == 'c' || harf=='C' ) {
            System.out.println("cuma cumartesi carsamba ");

        }
        else {
            System.out.println("yanlis girdiniz");
        }
    }

}

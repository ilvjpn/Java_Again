package day08;

import java.util.Locale;
import java.util.Scanner;

public class S1_IfElseIf {

    public static void main(String[] args) {
        // kullaniicidan gun ismi isteyiniz
        //girilen isim gecerli bir gun ise gun
        //isminin 1. 2. 3. harflaerini ilk harf buyuk diger ikisi kcuk olarak yazdirin
        // gun ismi gecerli degil ise yanlis girdiniz yaziniz

        Scanner scn = new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String gun = scn.nextLine();
        char ilkharf = gun.toUpperCase().charAt(0);
        String sonIki = gun.toLowerCase().substring(1,3);

        if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println(ilkharf+sonIki);

        } else if (gun.equalsIgnoreCase("sali") ) {
            System.out.println(ilkharf+sonIki);


        }else if (gun.equalsIgnoreCase("carsamba") ) {
            System.out.println(ilkharf+sonIki);


        }else if (gun.equalsIgnoreCase("persembe") ) {
            System.out.println(ilkharf+sonIki);


        }else if (gun.equalsIgnoreCase("cumartesi") ||gun.equalsIgnoreCase("cuma") ) {
            System.out.println(ilkharf+sonIki);


        }else{
            System.out.println("gecerli gun sayisi giriniz");
        }

        scn.close();
    }
}

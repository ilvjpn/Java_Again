package day08;

import java.util.Scanner;

public class S4_NestedIf {
    public static void main(String[] args) {

        // kullanicidan harf aliniz eger ilk harf  "A"  ile baslmaissa "Gecerli Sifre girdiniz"
        // 'a' harf ile baslamisssa "Gecersiz Sifre Girdiniz"
        // eger ilk harfi kucuk z olup olmadigina bakiniz. ilk harfi z ise gecerli sifre degil ise gecersiz sifre girdiniz


        Scanner scn = new Scanner(System.in);
        System.out.println("Sifre Griniz");
        char ilkharf = scn.nextLine().charAt(0);

        if (ilkharf >='A'&& ilkharf<='Z') {
            if (ilkharf=='A') {
                System.out.println("Dogru Girdiniz");

            }else
                System.out.println("yanzlis Girdiniz");

        }else if (ilkharf >= 'a'&& ilkharf<= 'z') {
            if (ilkharf == 'z') {
                System.out.println("Dogru Girdiniz");

            }else{
                System.out.println("yanlis girdiniz");
            }



        }else {
            System.out.println("yanlis girdiniz");
        }





        
    }
}

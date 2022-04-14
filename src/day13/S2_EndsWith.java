package day13;

import java.util.Scanner;

public class S2_EndsWith {
    public static void main(String[] args) {
        // bununla bitiyor mu sorar


        String str = "Javanin belasini sevem" ;

        System.out.println(str.endsWith("sevem"));
        System.out.println(str.endsWith("m"));

        System.out.println(str.endsWith("eve"));


       // kullnicidan mail adresi isteyiniz @ icermiyorsa mailiniz mail degil
        //  eger @ isareti iciriyor ama @gmail.com icermiyorsa "lutfen gmail adreesi yazin"
        // eger ilk iki sarti sagliyor ama @gamil ile bitmiyorsa gecersiz mail adresi yaziniz


        Scanner scn = new Scanner(System.in);
        System.out.println("mail adresinizi  giriniz");
        String str3 = scn.nextLine();
//
//        if (!str3.contains("@")) {
//            System.out.println("mail mail degil");
//
//        }else if (!str3.contains("@gmail.com")){
//
//            System.out.println("mail adresi yaziniz");
//        }else if(str.endsWith("@gmail.com")){
//
//            System.out.println("basarili");
//        }else
//            System.out.println("gecersiz gmail adresi");


        if (str3.contains("@")) {
            if (str3.contains("@gmail.com")) {
                if (str3.endsWith("@gmail.com")) {
                    System.out.println("mail kayitlandi");

                }

            }else{
                System.out.println("gmail adresi degildir");
            }

        }else{
            System.out.println("@ isareti yoktur");

        }










    }
}

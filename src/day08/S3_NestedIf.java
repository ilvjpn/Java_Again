package day08;

import java.util.Scanner;
import java.util.SortedMap;

public class S3_NestedIf {
    public static void main(String[] args) {

         // kullanicindan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyiniz
        // kural 1 : 4'e bolunmeyn yil artik yil degildir
        // Kural 2: 4'un kati olmasina ragmen 100 ile bolunmenebilen yillardan sadece 400'un kati olan yilar artik yildir



        Scanner scn = new Scanner(System.in);
        System.out.println("yil griniz");
        int yil = scn.nextInt();

//        if (yil%4 == 0) {
//            if (yil%100 == 0) {
//                if (yil%400 == 0) {
//                    System.out.println("artik yildir");
//
//                }else {
//                    System.out.println("artik yil degil");
//                }
//
//
//            }else{
//                System.out.println("artik yildir");
//            }
//
//
//
//        }  else if (yil%4!=0) {
//            System.out.println("artik yil degildir");
//
//
//
//        }  else
//            System.out.println("yanlis girdiniz");


        // 2. yontem

        if (yil%100 ==0&&yil>0) {
            if (yil%400 ==0) {
                System.out.println("Artik yil");

            }else {
                System.out.println("artik yil degil");
            }


        }else if (yil%100 != 100&&yil>0) {
            if (yil%4 ==0) {
                System.out.println("artik yil");

            }else {
                System.out.println("artik yil degil");
            }



        }else{
            System.out.println("yanlis Gridiniz");
        }




    }
}

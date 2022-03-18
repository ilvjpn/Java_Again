package day07;

import java.util.Locale;
import java.util.Scanner;

public class S3_IfElse {
    public static void main(String[] args) {
        // kullanicindan harf girmesini isteyiniz ve harf olup olmadigini yaziniz

        Scanner scn = new Scanner(System.in);
        System.out.println("herhengi birsey giriniz");
        char a = scn.next().toLowerCase().charAt(0);


        if (a >='a' && a<='z'  ) {
            System.out.println("girdiginiz karekter harftir");

        }else{
            System.out.println("girdigiiz harf degildir");


        }
    }

}

package day07;

import java.util.Scanner;

public class S5_IfElse {
    public static void main(String[] args) {

        // kullanicidan ucgenin kenar uzunluklarini aliniz ve
        //uc kenarida esit ise "eskenar" yoksa "eskenar degildir" yazdiriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklariniz giriniz");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if ( a == b && b==c) {
            System.out.println("eskenar ucgendir");

        }else{
            System.out.println("eskenar degildir");
        }
    }
}

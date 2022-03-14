package day06;

import java.util.Scanner;

public class S2_IfStatement {
    public static void main(String[] args) {

        // kullanicidan sayi aliniz ve sayi cift ie cift tek ise tek yazdirsim

        Scanner scn = new Scanner(System.in);
        System.out.println("sayi griniz");
        int sayi = scn.nextInt();

        if (sayi%2==0) {
            System.out.println("sayi cifttir");

        }else {
            System.out.println("sayi tektir");
        }
    }
}

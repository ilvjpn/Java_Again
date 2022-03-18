package day07;

import java.util.Scanner;

public class S6_IfElseIF {
    public static void main(String[] args) {
        // Kullanicidan 100 uzrinden notu isteyin . Notu harf sistemine cevirip yazdiriniz
        // 50'den kucuk ise D 50-60 arasinda ise C 60-80 arasinda ise  B  80'un uzerinde ise A yazdriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("yazili notunu giriniz");
        int not = scn.nextInt();

        if (not <=50  ) {
            System.out.println("D");

        } else if (not <60 ){
            System.out.println("C");
        }else if (not <80){
            System.out.println("B");
        }else if (not <100){
            System.out.println("A");
        }
        else if (not<=0 || not>100)
            System.out.println("yanlis girdiniz");
    }
}

package day09;

import java.util.Scanner;

public class S4_Ternary {
    public static void main(String[] args) {
        // Kullinicidan sayi aliniz Tek mi cift mi Yazdriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("Tam sayi yaziniz");
        int sayi = scn.nextInt();

        String ciftTek= sayi%2==0 ? "Cift":"Tek";
        System.out.println(ciftTek);

        // Girilen sayinin mutlak degerini yazdiriniz

        int mutlak = sayi>0 ? sayi:-sayi;   // Mutlak degerde hepsi pozitif sayi cikar
        System.out.println(mutlak);
    }
}

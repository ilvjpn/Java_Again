package day10;

import java.util.Locale;
import java.util.Scanner;

public class S5_SwitchCase {
    public static void main(String[] args) {

        // kullnicindan gun ismi alin ve hafta icin ve haftasonu oldugunu yazdirinz

        Scanner scn = new Scanner(System.in);
        System.out.println("gun ismi yaziniz");
        String gun = scn.nextLine().toLowerCase();

        switch (gun){

            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("hafta ici");break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("hafta sonu");break;
            default:
                System.out.println("yanlis Gridiniz");

        }
    }
}

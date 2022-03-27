package day10;

import java.util.Scanner;

public class S3_SwitchCase {
    public static void main(String[] args) {

        //  kullinicidan kacinci ayda oldugunu alin ay ismini yazdirin

        Scanner scn = new Scanner(System.in);
        System.out.println("ay sayisini yaziniz");
        int ay = scn.nextInt();

        switch (ay){
            case 1:
                System.out.println("ocak"); break;
            case 2:
                System.out.println("subat"); break;
            case 3:
                System.out.println("mart"); break;
            case 4:
                System.out.println("nisan"); break;
            case 5:
                System.out.println("mayis"); break;
            case 6:
                System.out.println("haziran"); break;
            case 7:
                System.out.println("temmuz"); break;
            case 8:
                System.out.println("agutos"); break;
            case 9:
                System.out.println("eylul"); break;
            case 10:
                System.out.println("ekim"); break;
            case 11:
                System.out.println("kasim"); break;
            case 12:
                System.out.println("aralik"); break;
            default:
                System.out.println("yanlis deger girdiniz");
        }


    }
}

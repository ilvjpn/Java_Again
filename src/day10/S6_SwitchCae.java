package day10;

import java.util.Locale;
import java.util.Scanner;

public class S6_SwitchCae {
    public static void main(String[] args) {
         // kullnicindan VIP kisatmasindan hangi harfin anlamini istedigini soralim
        // girilen harfin aciklmasini yazalim


        Scanner scn = new Scanner(System.in);
        System.out.println("Hangi harfi istiyorsaniz giriniz");
        char harf = scn.next().toLowerCase().charAt(0);  //bursini String yapsaydik sadece ilk harf yazdigimizda calisacak

        switch (harf){
            case 'V':
            case 'v':
                System.out.println("vana"); break;
            case 'I':
            case 'i':
                System.out.println("isler"); break;
            case 'P':
            case 'p':
                System.out.println("pinar"); break;
            default:
                System.out.println("yanlis girdiniz");

        }


    }
}

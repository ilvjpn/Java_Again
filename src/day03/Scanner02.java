package day03;

import java.util.Scanner;
import java.util.SortedMap;

public class Scanner02 {
    public static void main(String[] args) {

        // kullanicindan ismini girmesini isteyin ver ilk harfini buyuk harfle yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();
       char ilkharf = isim.toUpperCase().charAt(0);
        System.out.println(ilkharf);


        // 2. Yontemmmm

        System.out.println("soyismizi yaziniz");
        char ilkharf2 = scan.next().toUpperCase().charAt(0);
        System.out.println(ilkharf2);
        System.out.println(ilkharf+"."+ ilkharf2+".");
    }
}

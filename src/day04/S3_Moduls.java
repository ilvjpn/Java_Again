package day04;

import java.util.Scanner;
import java.util.SortedMap;

public class S3_Moduls {

    public static void main(String[] args) {
        // kullanicindan 4 basamakli sayi isteyiniz ve sayiyi ters sirada yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli sayi griniz");
        int sayi = scan.nextInt();

        int birler = sayi%10;
        System.out.println(birler);
        int onlar = (sayi/10)%10;
        System.out.println(onlar);
        int yuzler = (sayi/100)%10;
        System.out.println(yuzler);
        int binler = (sayi/1000)%10;
        System.out.println(binler);

        System.out.println(birler+""+onlar+""+yuzler+""+binler);

        System.out.println(binler+yuzler+binler+onlar);// Rakamlarin toplami icin
    }
}

package day03;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz ");
        String isim = scan.nextLine();
        System.out.println(isim);

        System.out.println("soy isminizi giriniz");
        String Soyisim = scan.nextLine();
        System.out.println(Soyisim);
        System.out.println("Kaydiniz basari seklinde alinmistir");
        scan.close();
    }
}

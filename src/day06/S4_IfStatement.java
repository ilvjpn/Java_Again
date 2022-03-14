package day06;



import java.util.Locale;
import java.util.Scanner;

public class S4_IfStatement {
    public static void main(String[] args) {

        // kullanicidan gun ismini isteyiniz
        // girilen gun hafta ici veya haftasonu oldugunu yazdiriniz

        Scanner scn = new Scanner(System.in);
        System.out.println("gun ismini giriniz");
        String str = scn.nextLine();

        if (str.equalsIgnoreCase("pazar") || str.equalsIgnoreCase("Cumartesi")) {
            System.out.println("hafta sonu");

        }else if (str.equalsIgnoreCase("pazartesi")||str.equalsIgnoreCase("sali")||str.equalsIgnoreCase("carsamba")||str.equalsIgnoreCase("persembe")
        ||str.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ici");

        }else {
            System.out.println("yanlis girdiniz");
        }





    }
}

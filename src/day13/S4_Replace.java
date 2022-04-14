package day13;

import java.util.Locale;
import java.util.Scanner;

public class S4_Replace {
    public static void main(String[] args) {

// kullanicidan bir cumle isteyiniz
// cumledeki tum bosluklari silin ve
//tum a'lari yerine  a yazdiriniz


        Scanner scn = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String str = scn.nextLine();

        String bosluksuz = str.replace(" ", "");
        System.out.println(bosluksuz);

        String yer = str.replace("a","e");
        System.out.println(yer);


        System.out.println("cumle daha  giriniz");
        String str2 = scn.nextLine();

        String bosluksuz2 = str2.replace(" ","").replace("a","e");
        System.out.println(bosluksuz2);

        // Hem a yerine Hemde e yerine i yaziniz

        String ikili = str2.toLowerCase().replace("a","i").replace('e','i');
        System.out.println(ikili);





    }
}

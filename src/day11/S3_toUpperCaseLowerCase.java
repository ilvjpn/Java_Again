package day11;

import java.util.Locale;

public class S3_toUpperCaseLowerCase {
    public static void main(String[] args) {

        // str.toLowerCase()  Verilen Stringin tamamini kucuk harflere cevirir
        //str.toUpperCase()    Verilen Stringin tamamini buyuk harflere cevirir

        String str = "Muhammed kouI";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // Eger atama yapmak istersek

        str = str.toUpperCase();
        System.out.println(str);  // Kalici olarak oldu

        System.out.println(str.toLowerCase(Locale.JAPANESE));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));



    }
}

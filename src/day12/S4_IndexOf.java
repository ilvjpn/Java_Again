package day12;

import java.util.Locale;
import java.util.Scanner;

public class S4_IndexOf {
    public static void main(String[] args) {

        // Index Of methodu istedigimiz karakterlerin sira sayisini verir

        String str = "Java ogren, is sahibi ol";
        System.out.println(str.charAt(6));
        System.out.println(str.indent(1));
        System.out.println(str.indexOf('g')); // sadece bir harf aranir
        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf("is"));// burada is tek harfmis gibi dusunecek "i" nin sira numarasi ne ise o olacak
        System.out.println(str.indexOf("sahib"));
        System.out.println("Birden fazla harf var ise "+ str.indexOf("i")); // ilk buldugunu alir gelir

        // Belirli birsey belirletikten sonraki harfi istemek

        System.out.println(str.indexOf('a', 3));  // 3 numarali indexten sonra olan ilk "a" yi yazdir demek
        System.out.println(str.indexOf("ali"));


        // kullicidan bir cumle isteyiniz
        // Java kelimesi var mi yok mu yaziniz

        Scanner scn = new Scanner(System.in);
        System.out.println("cumle yaziniz");
        String str2 = scn.nextLine().toLowerCase();

//        int sonuc = str2.indexOf("java");
//        System.out.println(sonuc);
//
//        System.out.println(sonuc!=-1 ? "sana iceriyor":"sana icermiyor");

        if (str2.indexOf("java")>=0) {
            System.out.println("java iceriyor");

        }else{
            System.out.println("java icermiyor");
        }










    }
}

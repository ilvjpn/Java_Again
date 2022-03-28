package day12;

import java.util.Scanner;

public class S3_Lenght {
    public static void main(String[] args) {

        // Stringin karakter sayisini yani uzunluk verir

        String str1 = "Ali Can";
        String str2 = "";
        String str3 = null;

        System.out.println(str2.length());
        System.out.println(str1.length());
        //System.out.println(str3.length());          RTE verir

        // Kullnicidan bbir string girmesini isteyiniz ve kullanicindan son harfini buyuk olarak cikmasini saglayin

        Scanner scn = new Scanner(System.in);
        System.out.println("String giiriniz");
        String str = scn.nextLine();

        char son = str.toUpperCase().charAt(str.length()-1);
        System.out.println(son);

    }
}

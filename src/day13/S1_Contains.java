package day13;

import java.util.Locale;
import java.util.Scanner;

public class S1_Contains {
    public static void main(String[] args) {

        // Char icin olusturulmaz sadece string icin olusturulur

        // Kullanicidan  bir cumle ve aramak istedigi bir stringi isteyiniz
        //cumle Stringi iceriyorsa "basarili diyelim" degilse "basarisinz" deyiniz

        Scanner scn = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String str = scn.nextLine().toLowerCase();
        System.out.println("aramak istediginiz cumleyi griniz");
        String str2 = scn.nextLine().toLowerCase();

        System.out.println(str.contains(str2));

        String sonuc =str.contains(str2) ? "Iceriyor" : "icermiyor";
        System.out.println(sonuc);



        // kullnicidan mail adresi isteyiniz @gmail.com iceriyorsa mailiniz kayit edildi
        //yoksa lutfen dogru griniz yazsin


        System.out.println("mail adresinizi  giriniz");
        String str3 = scn.nextLine();

        if (str3.contains("@gmail.com")) {
            System.out.println("mailiniz uygun");

        }else
            System.out.println("uygun degil");


    int sonuc2= str3.indexOf("@gmail.com",str3.length()-10);

        System.out.println(sonuc2==-1 ? "mail gecersiz":"mail gecerli" );













    }
}

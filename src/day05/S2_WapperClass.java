package day05;

import java.util.Locale;

public class S2_WapperClass {
    public static void main(String[] args) {

        String isim = "mehmet";
        System.out.println(isim.toUpperCase());

        // Boolean , char , byte , short , int , long , float , double

        byte sayi=10;

        Byte sayi2=11; // ismen promivite data turu ile ayni ama non-primitive datalara Wapper denir

        System.out.println(sayi2);

        Byte byteMiniSayi = Byte.MIN_VALUE;
        System.out.println(byteMiniSayi);

        Byte byteMaxSayi = Byte.MAX_VALUE;
        System.out.println(byteMaxSayi);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);









    }
}

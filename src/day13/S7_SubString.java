package day13;

public class S7_SubString {
    public static void main(String[] args) {

        String str = "Her ders java gibi olsa";



        System.out.println(str.substring(0,10)); // ** bunda 10 dahil degil
        System.out.println(str.substring(10)); // ilk 10 harfi yazar  ***bunda 10 dahil

        System.out.println(str.substring(str.length()-10)); // son 10 harfi yazar.


        // str ilk 10 harfini * ile gizleyiniz ve griye kalanlar yazilsin
        System.out.println(str.substring(0,10).replaceAll("\\D","*")+str.substring(10));


        System.out.println(str.substring(10,10));  // ilk'i al der ikicisi alma der 
    }
}

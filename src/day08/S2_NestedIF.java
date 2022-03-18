package day08;

public class S2_NestedIF {
    public static void main(String[] args) {

        // verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini yazdiran
        // bir program yazdiriniz
        // eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
        // calisan erkek ise 65 yasindan buyuk ise emekli olabilir

        String cinsiyet = "erkek";
        int yas = 62;

        if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (yas<0) {
                System.out.println("yas negatif olamaz");

            }else if (yas<65) {
                System.out.println("emekli olmazsin");

            }else{
                System.out.println("emekli olabilirsin");
            }


        }else if (cinsiyet.equalsIgnoreCase("kadin")) {
            if (yas<0) {
                System.out.println("0'dan kucuk olamaz");

            }else if (yas<60) {
                System.out.println("emekli olamazsin");

            }else{
                System.out.println("emekli olabilirsin");
            }



        }else {
            System.out.println("yanlis cinsiyet girdiniz");
        }



    }
}

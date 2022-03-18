package day09;

public class S1_TernaryOperator {
    public static void main(String[] args) {

        int sayi=101;

        // sayi%2==0 ? "cift sayi":"tek sayidir"; bu deger tek basina kullanilmaz bir degere atamamiz lazim

        String sonuc = sayi%2==0 ? "cift sayi":"tek sayidir";
        System.out.println(sonuc);

        // bir degere atama yapmak istemezsek o zman ne yapmayiz

        System.out.println(sayi%2==0 ? "cift sayi":"tek sayidir");

    }
}

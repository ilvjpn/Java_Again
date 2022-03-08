package day04;

public class S2_ModulsOperator {
    public static void main(String[] args) {

        //modulus operatoru bolme isleminde kalani verir

        int kalan = 15%4;
        System.out.println(kalan);

        //856 sayisinin birler onlar yuzler  basamagi kactir

        int birler = 856%10;
        System.out.println(birler);

        int onlar = (856/10)%10;
        System.out.println(onlar);

        int yuzler =(856/100)%10;
        System.out.println(yuzler);

    }
}

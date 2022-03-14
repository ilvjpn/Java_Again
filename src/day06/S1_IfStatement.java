package day06;

public class S1_IfStatement {
    public static void main(String[] args) {

        int a = 10;
        int b =8;

        if (a>b) {
            System.out.println("ilk sayi buyuktur");

        }

        if (a*b <0) {
            System.out.println("sayi negatiftir");

        }
        if (a<b || b>0) {
            System.out.println("or'lu cumle calisti");

        }
        if (a-b>0 && a*b>0) {
            System.out.println("&& cumlesi calisti");

        }






    }
}

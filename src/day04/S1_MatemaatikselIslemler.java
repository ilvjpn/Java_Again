package day04;

public class S1_MatemaatikselIslemler {

    public static void main(String[] args) {

        int num = 38 / 2*(4+3)*2;
        System.out.println(num);

        int num2 = 8+2*(14-6/2)-12;
        System.out.println(num2);

        int num3 = 10;

        double num4= num*num2/num3;  // sag tarafinin hepsi int oldugu icin islemi int seklinde cikarir. sonuc: 478.8

        System.out.println(num4);


        double num5=24;
        double num6=14.2;    // ikide double oluca sag taraf double oldu
        double num7=num5/num6;
        System.out.println(num7);


        System.out.println(num5/num3);  // burda da genis olana gore yer alir.


        double num8 = (double) num*num2/num3; // eger buradaki sonucu kusuratli cikartmak istersek baslarina double yazariz
                                     // auto widing ile alakali degildir

        System.out.println(num8);

    }
}

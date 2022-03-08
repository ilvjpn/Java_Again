package day03;

public class S7_PreIncrementPostIncrement {
    public static void main(String[] args) {


           int num =20;
            num++;
        // Yukaridaki deger syaiyi bir artirir ama asagidaki deger sayiyi ayni birakir.

        System.out.println(num); //21
        System.out.println(num++); //21   once yazdiriyor sonra artiriyor.
        System.out.println(num); //22

        System.out.println(++num); //23
        System.out.println(num); //23


    }
}

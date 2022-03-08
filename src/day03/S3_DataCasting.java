package day03;

public class S3_DataCasting {
    public static void main(String[] args) {
        // byte veri tunde deger olusturup degere atayin
        // olusturulan variable adim adaim Auto Wideing ile genisletip yazdirin
        //** kucukten buyuge dogru

        byte numByte=34;
        System.out.println(numByte);
        short numShort = numByte;
        System.out.println(numShort);
        int numInt = numShort;
        System.out.println("int Degeri :"+numInt);
        long numLong = numInt;
        System.out.println("long Degeri :"+numLong);
        float numFlat = numLong;
        System.out.println("float Degeri :"+numFlat);
        double numDouble = numFlat;
        System.out.printf("double Degeri :" + numDouble);


    }
}

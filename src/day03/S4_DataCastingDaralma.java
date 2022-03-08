package day03;

public class S4_DataCastingDaralma {
    public static void main(String[] args) {

        // Double deger olustur bunu Byte ve Int cevir.

        double numDou= 15;
        int numInt = (int) numDou;
        System.out.println("Int Deger: "+numInt);

        byte numByte = (byte) numDou;
        System.out.println("byte deger :"+ numByte);
        //***************            *******************              ***********************
        double num = 15.5;
        int num2 = (int) num; /// burada 15.5 olan saynin ondalik sayidan sonrasini siler atar.
        System.out.println("ondalik deger ama :"+num2);
        //***************            *******************              ***********************
        double num3= 129.56;
        byte num4 = (byte) num3;   // 127'e kadar gider sonra -128 gider ordan saymaya devam eder.
        System.out.println(num4);
        //***************            *******************              ***********************




        //***************            *******************              ***********************




    }
}

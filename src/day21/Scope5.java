package day21;

public class Scope5 {
    public static void main(String[] args) {


        for (int i = 0; i <5 ; i++) {

            String isim = "Ayse";
            System.out.println(i+" "+ isim);


        }
        // System.out.println(isim);  Loop icinde olustugu icin Loop icinde olusur yoksa disinda ulasilmaz


        int count =0;
        while (count<5){
            System.out.println(count);
            count++;
        }
    }
}

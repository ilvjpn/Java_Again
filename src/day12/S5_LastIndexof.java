package day12;

import java.util.Scanner;

public class S5_LastIndexof {
    public static void main(String[] args) {
        //kulliicidan bir cumle aliniz ve asagidaki 3 durumdan uygun olani yazdirin
        // java icermiyor
        // java iceriyor
        // birden fazla java var

        Scanner scn = new Scanner(System.in);
        System.out.println("cumle yaziniz");
        String str2 = scn.nextLine().toLowerCase();

        if (str2.indexOf("saman")==-1) {
            System.out.println("saman icermiyor");

        }else if (str2.lastIndexOf("saman")==str2.indexOf("saman")){
            System.out.println("bir saman iceriyor");

        }else{
            System.out.println("birden fazla iceriyor");
        }


    }
}

package day21;

public class Scope2 {

    public static void main(String[] args) {
        // Static variable icin obje olusturya gerek yoktur
        // baska bir classta sitatic variable ulsmak istediginiz
        // class adi nokta static varibale adi yazmak yeterlidir


        System.out.println(Scope1.okulAdi);
        System.out.println(Scope1.okulId);   // ilk giren kod gelir. java run time bir programdir


        Scope1.okulAdi="Mehmet Koleji";
        System.out.println(Scope1.okulAdi);

        Scope1.method();
        System.out.println(Scope1.okulId);
        System.out.println(Scope1.okulAdi);


    }


}

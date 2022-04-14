package day21;

public class Scope2 {

    public static void main(String[] args) {
        System.out.println(Scope1.okulAdi);
        System.out.println(Scope1.okulId); // ilk girinlen degerleri ceker.

        Scope1.okulAdi="Mehmet Koleji";
        System.out.println(Scope1.okulAdi);

        Scope1.method();
        System.out.println(Scope1.okulAdi);

    }


}

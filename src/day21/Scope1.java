package day21;

public class Scope1 {

    static int okulId =1201;
    static String okulAdi = "Yildiz Koleji";
    static boolean acikMi;

    public static void main(String[] args) {

        System.out.println(okulAdi+" "+okulId+" "+ acikMi);

        okulId=1202;
        acikMi=true;


        method();
        System.out.println(okulAdi+" "+okulId+" "+ acikMi);

    }
    public static void method() {
        System.out.println(okulAdi+" "+okulId+" "+ acikMi);
        okulId=1203;







    }

    public void bos(){
        okulId=1205;
    }
}

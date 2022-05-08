package day21;

public class Scope4 {



    public static void main(String[] args) {

        int sayi =10;

        int sayi2; // bir local variable deger atanmadan da olusturulur
        //System.out.println(sayi2); // Ancak ilk deger atamasi yapilmayan varibler kullanilmaz

        //  sayi2++; buda olmaz
        
        // Java deger atamasi olmadan varibale olusturulmasina izin verir ileride deger etanacak die bekler







        staticMethod();

    }

    public static void staticMethod() {
        String isim = "Hasan";
    }


    public  void method() {

        boolean isTrue= true;

    }
}

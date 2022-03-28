package day12;

public class S1_EqualsCiftEsitFark {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = str1+"";
        System.out.println(str1==str2); // == hem adreslere hamde yazinin cikisina bakar esit mi die
        System.out.println(str1.equals(str2)); // equals isareti ise sadece yazinin cikisina bakar esit mi die

        // herhangi bir + isareti ile islem yaparsak o zaman adresleri degismis olacak


    }
}

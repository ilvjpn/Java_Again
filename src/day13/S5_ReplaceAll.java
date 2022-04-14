package day13;

public class S5_ReplaceAll {
    public static void main(String[] args) {


        String str = "Java Ogren , Mutlu ol , Java Candir, 05339 475 32";
        System.out.println(str.replace("Java", "hava"));

        // ReplaceAll otekine benzer ama arasindaki fark char olmaz
        // ReplaceAll methodu regexp kullanimina izin verir


        System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yarine * yazilir
        System.out.println(str.replaceAll("\\W", "-"));  // tum harf ve rakamlar disindaki karakterler
        System.out.println(str.replaceAll("\\s","+")); // tum bosluk yerine +
        System.out.println(str.replaceAll("\\S",".")); // bosluk disindaki tum karakterler
        System.out.println(str.replaceAll("\\d","?"));  // tum rakamlar yerine ? olur
        System.out.println(str.replaceAll("\\D","<>")); // rakama disindaki tum karakterler yerine <>


    }
}

package day12;

public class S2_EqualsIgnorCase {
    public static void main(String[] args) {

        // kucuk buyuk harf durumuna bakmaz direk yaziya bakar


        String str1 = "Ali Can";
        String str2 ="ali can";
        String str3 ="ali can "; // Bosluk bir karaterdir
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}

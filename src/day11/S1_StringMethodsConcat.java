package day11;

public class S1_StringMethodsConcat {
    public static void main(String[] args) {

        // Concatenation : toplama degil birlestirme yapar

        System.out.println(15+20+" merhaba");
        System.out.println("merhaba"+15+10);
        System.out.println("merhaba "+15*9);

        String str = "Hello";
        String str2 ="DUnya";

        System.out.println(str+str2);
        System.out.println(str.concat(str2));
        System.out.println(str.concat(" ").concat(str2));
        System.out.println(str.concat(" "+str2));





    }
}

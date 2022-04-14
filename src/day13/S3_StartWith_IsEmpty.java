package day13;

public class S3_StartWith_IsEmpty {
    public static void main(String[] args) {

        String str = "Her gun java olsun";

        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("Her "));
        System.out.println(!str.startsWith("r",2));  // index 2 r ile mi basliyor sorusu


        System.out.println(str.isEmpty());


        String str2 ="";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank()); // yeni version'larda vardir.




    }
}

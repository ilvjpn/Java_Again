package day11;

public class S4_Equals {
    public static void main(String[] args) {

        // str.equals(str2) str ve str2 ' yi karsilastirir
        // String olarak esit olp olmadiklarina bakar

        String str = "Ali Can";
        String str2 ="Ali can";

        System.out.println(str.equals(str2));

        System.out.println(str.equals(str2)? "esit":"esit degildir");
    }
}

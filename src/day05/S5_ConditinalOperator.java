package day05;

public class S5_ConditinalOperator {
    public static void main(String[] args) {

        //  " && " AND  " || " OR demektir.

        boolean isTrue = 5>4 && 7-3>0;
        System.out.println(isTrue);


        int x= 10;
        int y=5;
        System.out.println(x/y==2 && x*y>20 && x-y>0);

        System.out.println(x+y<0&&x-y>0);

        //  OR yani ' || '
        // AND gibi degildir bir tanesi dogru ise hepsini dogru yapar true yapar

        System.out.println(x<y || x+y <0 || x*y>0);

         System.out.println("Githup'tan merhaba");



        }


}

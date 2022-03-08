package day05;

public class S3_Concatenation {
    public static void main(String[] args) {
        // Birletirme demektir. Birden Fazla Stringi toplama islemi ile toplarsak yan yana yazdirir

        String str ="Java";
        String str2="Guzeldir";

        System.out.println(str+str2);
        System.out.println(str+" "+str2);


        int sayi =5;
        int sayi2=4;
        System.out.println(sayi+sayi2);

        System.out.println(sayi+sayi2+str+str2);

        System.out.println(str+str2+sayi+sayi2);

        System.out.println(str+str2+(sayi-sayi2));

        //verilen degiskenlerle 9 java yazdiriniz

        System.out.println(sayi+sayi2+" "+str+str2); // eger char ile yapsaydik ' ' ile yapsaydik 41 java yazidiriidi
        //yani char'in ascii degerine bakarak is yapardi ascii degeri 32'dir

        System.out.println(sayi+sayi2+str+str2+' ');
        System.out.println(sayi+sayi2+' '+str+str2);

        System.out.println(str+str2+sayi*sayi2);

    }
}

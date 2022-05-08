package day22_constructor;

public class ParametreliRunner {
    public static void main(String[] args) {

        Parametreli para = new Parametreli(); // bu Object sadece Parametrsiz degeri kulanir
        System.out.println(para.marka+" "+para.model+" "+para.yil+" "+para.kazaVarMi);



        Parametreli para2 = new Parametreli(2015);
        System.out.println(para2.marka+" "+para2.model+" "+para2.yil+" "+para2.kazaVarMi);


        Parametreli para3 = new Parametreli("Toyota","Corolla",2015,true);
        System.out.println(para3.marka+" "+para3.model+" "+para3.yil+" "+para3.kazaVarMi);

        Parametreli para4 = new Parametreli("Jeep","Linea");
        System.out.println(para4.marka+" "+para4.model+" "+para4.yil+" "+para4.kazaVarMi);


        Parametreli para5 = new Parametreli("cooper");
        System.out.println(para5.marka+" "+para5.model+" "+para5.yil+" "+para5.kazaVarMi);
        para5.yakit("dizel");









    }
}

package day22_constructor;

public class Car {

    String marka ;
    String model ;
    int yil ;
    boolean kazaVarMi;
     static int aracId=1201;



    public static void main(String[] args) {

        Car car1 = new Car();

        System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazaVarMi);

        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2010;
        car1.kazaVarMi=false;

        System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazaVarMi);



        Car car2 = new Car();

        car2.kazaVarMi=true;
        car2.marka= "Opel";
        car2.model="Astra";
        car2.yil= 2015;


        System.out.println(car2.marka+" "+car2.model+" "+car2.yil+" "+car2.kazaVarMi);


        car1.kazaVarMi=true;  // car1'e ait herhangi bir ozalligi sonradan degistirebiliriz








    }
}

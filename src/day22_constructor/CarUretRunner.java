package day22_constructor;

public class CarUretRunner {
    public static void main(String[] args) {

        // Bu classta gorunur constsort yoktur
        // bir class olusuturldugunda  java classtan obje uretilecegini bilir ve gorulmayan
        // DEFAULT CONSTRUCTOR class'a yestirir.
        // DEFAULT CONSTRUCTOR parametresizdir dolaysiyla hic bir ozallligi tanimlanmayan objler uretir

        // Eger biz sonradan constructor olusuturusak default constructor olur



        CarUret car1 = new CarUret();

        car1.model= "Corolla";
        car1.marka="toyota";
        car1.yil=2015;
        car1.kazaVarMi=true;

        System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazaVarMi);

        car1.yakit("benzin");
        System.out.println();
        car1.vites("duz");





    }
}

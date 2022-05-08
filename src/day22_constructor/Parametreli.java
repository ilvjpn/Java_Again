package day22_constructor;

import java.util.logging.SocketHandler;

public class Parametreli {



    String marka ;
    String model ;
    int yil ;
    boolean kazaVarMi;

    public Parametreli( int sene){

        this.yil=sene;


    }
    public Parametreli(){

    }

    public Parametreli(String marka, String model){

        this.model=model;
        this.marka=marka;

    }

    public Parametreli(String marka, String model, int yil, boolean kazaVarMi){

        this.marka=marka;
        this.yil=yil;
        this.kazaVarMi=kazaVarMi;
        this.model=model;



    }

    public  Parametreli(String model){
        this();
        this.model="Saman";





    }



    public void yakit(String yakit) {


        System.out.printf("Araba Yakit Olarak "+ yakit+ " kullanir");
    }

    public void vites (String vites){

        System.out.printf("Araba "+ vites+ " Viteslidir");

    }

}

package day22_constructor;

public class CarUret {

    String marka ;
    String model ;
    int yil ;
    boolean kazaVarMi;
    static int aracId=1201;


    // Bir Constructor olusturalim
   public CarUret(){

    }
    //  1- class ismi ile ayni olmalidir // buyuk isim ile baslamali
    //  2- Constructor return type sahip degildir // void vs
    //  3- Constructor isminden sonra keisnlikle () olmalidir
    //  4- Constructor olusurturukdugunda kimlerin kullanacagini  belirlemek icin public private demeliyiz






    // ozellikler bu classta toparlanir ve direk calistirilmayacagi icin main method olmasada olr
    // bu programda cok fazla ureteceginiz objeler icin bir tane class olustururuz
    //bu classta olustururlacak objelere ait tum ozallikler olur


    public void yakit(String yakit) {


        System.out.printf("Araba Yakit Olarak "+ yakit+ " kullanir");
    }

    public void vites (String vites){

        System.out.printf("Araba "+ vites+ " Viteslidir");

    }
}

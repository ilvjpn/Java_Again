package day03;

public class S5_incrementDecrement {
    public static void main(String[] args) {

        // bir variable'nin degeri toplayacak artirmak icin 3 yontem vardi

        int num= 10;
        System.out.println(num);
        num = num + 10;
        System.out.println("1. yontem : "+num);
        num+=10;
        System.out.println("2. yontem : "+num);
        num++;
        System.out.println("3. yontem : "+num);

        // sayiyi 6 cikart

        num -=6;
        System.out.println("cikartma islemi: "+num);
        num--;
        System.out.println("sayiyi 1 eklsiltme: "+num);
        num /= 6;
        System.out.println("bolme islemi:"+ num);


    }
}

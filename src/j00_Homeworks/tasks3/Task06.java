package j00_Homeworks.tasks3;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan=new Scanner(System.in);
        System.out.println("kenarları gir");
        int x=scan.nextInt();
        int y=scan.nextInt();

        double hipo=Math.sqrt((x*x)+(y*y));
        System.out.println(hipo);

    }
}

package j00_Homeworks.Tasks4.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("süre");
        int saat = scan.nextInt();
        int dk = scan.nextInt();
        int saniye = scan.nextInt();
        System.out.println("süre="+(saat*3600+dk*60+saniye));

    }

}

package j00_Homeworks.tasks3;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kg:");
        Byte kg=scan.nextByte();
        System.out.println("Kilo = " + kg);


    }
}

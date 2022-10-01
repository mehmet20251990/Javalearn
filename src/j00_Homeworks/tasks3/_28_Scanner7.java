package j00_Homeworks.tasks3;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Banka hesabınız var mı:");
        Boolean bankaHesabi=scan.nextBoolean();
        System.out.println("Banka Hesabı = " + bankaHesabi);

    }
}

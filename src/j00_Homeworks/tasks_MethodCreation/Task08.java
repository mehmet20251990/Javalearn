package j00_Homeworks.tasks_MethodCreation;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir yıl giriniz, artık mı değil mi söyleyelim ");
        int yıl=scan.nextInt();
        artıkyıl((int) yıl);

    }

    private static void artıkyıl(int yıl) {
        System.out.println((yıl%4==0?(yıl%100==0?(yıl%400==0?"true":"false"):"false"):"false"));
    }
}

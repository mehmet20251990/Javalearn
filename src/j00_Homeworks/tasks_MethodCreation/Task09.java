package j00_Homeworks.tasks_MethodCreation;

import java.util.Scanner;

import static j00_Homeworks.tasks_MethodCreation.Task03.sn;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("saat gir");
        int saat = sc.nextInt();
        System.out.println(saniye(saat));


    }

    private static int saniye(int a) {
        return a*3600;
    }
}

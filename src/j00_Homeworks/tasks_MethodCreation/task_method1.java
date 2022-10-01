package j00_Homeworks.tasks_MethodCreation;

import java.util.Scanner;

public class task_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir");
        int max=scan.nextInt();

        randomNum(max);
    }
    private static int randomNum(int max) {
        return max = (int)(Math.random()*max);
    }
}

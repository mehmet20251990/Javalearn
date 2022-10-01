package j00_Homeworks.tasks3;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Uyku saati:");
        Integer uyku=sc.nextInt();

        System.out.println("Ayda = " +(30*uyku/24));
        System.out.println("Yılda ="+(30*uyku/24*12));
        System.out.println("40 Yılda ="+(30*uyku/24*12*40));

    }
}

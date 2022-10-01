package j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.
 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("mail gir");

        String mail= sc.nextLine();

        for (int i = 0; i<mail.length(); i++){
            char c = mail.charAt(i); // Döngüdeki her bir karakteri c'ye atar
            if (c==' ') continue;  // c de ' ' karakteri varsa if blok run olur
                                   // if blok loop'u atlatır

            System.out.println(c); // Looptan elde edilen karakterleri c ye atayıp print eder...
        }

    }
}

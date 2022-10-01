package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        // Task-> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime= sc.nextLine();

        int krktrSy = 0;
        for (int i=0; i<kelime.length(); i++){
            if (kelime.charAt(i)=='a'){
                krktrSy++;
            } else if (kelime.charAt(i)=='c') {
                break;
            }
        }
        System.out.println(krktrSy);
    }
}

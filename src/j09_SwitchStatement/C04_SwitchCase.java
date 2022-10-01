package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // TASK-> Girilen ayın hangi mevsimde olduğunu print et

        Scanner sc = new Scanner(System.in);
        System.out.print("kaçıncı ayda olduğunu gir: ");
        int ay = sc.nextInt();

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println(" hatalı rakam girdiniz");
                break;
        }

    }
}

package j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {

        // TASK-> kullanıcının girdiği yılın ay sırasına göre ayın ismini print eden code create et.

        Scanner sc = new Scanner(System.in);
        System.out.print("kaçıncı ayda olduğunu gir: ");
        int ay = sc.nextInt();

        switch (ay) {
            case 1:
                System.out.println(" Ocak");
                break;
            case 2:
                System.out.println(" Şubat");
                break;
            case 3:
                System.out.println(" Mart");
                break;
            case 4:
                System.out.println(" Nisan");
                break;
            case 5:
                System.out.println(" Mayıs");
                break;
            case 6:
                System.out.println(" Haziran");
                break;
            case 7:
                System.out.println(" Temmuz");
                break;
            case 8:
                System.out.println(" Ağustos");
                break;
            case 9:
                System.out.println(" Eylül");
                break;
            case 10:
                System.out.println(" Ekim");
                break;
            case 11:
                System.out.println(" Kasım");
                break;
            case 12:
                System.out.println(" Aralık");
                break;
            default:
                System.out.println(" hatalı rakam girdiniz");
                break;
        }

    }
}

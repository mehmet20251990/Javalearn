package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Girilen ay nosuna göre kaç gün çektiğini primt eden code create et.

        System.out.print("kaçıncı ayda olduğunu gir: ");
        int ay = sc.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30");
                break;
            case 2:
                System.out.println("yılı gir");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("29");
                } else System.out.println("28");
                break;
            default:
                System.out.println(" hatalı rakam girdiniz");
                break;
            // TRİCK-> Girdiği CASEin sonunda break yoksa diğer CASEleri de okumaya devam eder...!!!
        }

    }
}

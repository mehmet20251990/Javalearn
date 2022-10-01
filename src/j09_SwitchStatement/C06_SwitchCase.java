package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        // TASK-> Girilen haftanın gününü haftaiçi veya sonu olduğunu print et

        Scanner sc = new Scanner(System.in);
        System.out.println("Günü gir");
        String gun = sc.nextLine().toLowerCase(); // PaZaR girilse bile karakterler küçülür...

        switch (gun){
            case "pazartesi" :
            case "salı" :
            case "çarşamba" :
            case "perşembe" :
            case "cuma" :
                System.out.print("haftaiçi");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.print("haftasonu");
                break;
            default:
                System.out.println("Hatali bir islem yaptiniz");
        }
    }
}

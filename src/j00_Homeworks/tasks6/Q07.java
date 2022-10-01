package j00_Homeworks.tasks6;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime= scan.nextLine();

        System.out.println((kelime.charAt(0)==kelime.charAt(1)&&kelime.charAt(0)==kelime.charAt(2))?"truee":"falsee");

    }
}
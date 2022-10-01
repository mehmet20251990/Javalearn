package j08_ifStatement_Ternary_Operator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
TASK :
       Girilrn bir pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
       4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
       Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayı = sc.nextInt();

        System.out.println(sayı > 999 && sayı < 10000 ? "Dört basamaklı" : (sayı % 2 == 0 ? "çift" : "tek"));


    }
}

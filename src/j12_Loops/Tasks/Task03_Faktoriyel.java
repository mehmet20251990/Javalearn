package j12_Loops.Tasks;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {
         /*
    Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
    sayi!= 1*2*3* ...*sayi
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayı=sc.nextInt();

       // faktoriyel(sayı);
        System.out.println(faktoriyel(sayı));

    }

    private static int faktoriyel(int sayı) { // void
        int faktoriyel=1;
        for (int i = 1; i <= sayı; i++) {
            faktoriyel*=i;
        }
       // System.out.println(faktoriyel);
        return faktoriyel;
    }
}

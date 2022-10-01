package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı gir");
        int x= sc.nextInt();
        int y=sc.nextInt();

        if (x<y){
            while (x<y){
                System.out.println(x+" ");
                x++;
            }
        } else if (y<x) {
            while (y<x) {
                System.out.println(y + " ");
                y++;
            }
        }else System.out.println("eşitler");
    }
}

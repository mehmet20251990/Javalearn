package j00_Homeworks.ArraysTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)
         */
        Scanner sc = new Scanner(System.in);
        int numb[] = new int[8];
        int count = 0;

        for (int i=0; i<numb.length; i++){
            System.out.println("sayı");
            if ((numb[i]=sc.nextInt())%3==0){
              count++;
            }
        }
        System.out.println(Arrays.toString(numb));
        System.out.println(count);



    }

}

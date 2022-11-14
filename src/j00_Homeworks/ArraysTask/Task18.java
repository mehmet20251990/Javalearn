package j00_Homeworks.ArraysTask;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // Task -> sayi arr'deki iç arraylerin toplamını yeni bir arr ye atayıp print eden code create ediniz

       int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output: int yeniArr[]={6,11,-7}
        int yeniArr[]=new int[sayi.length];
        int toplam =0;
        for (int i=0; i< sayi.length; i++){
            for (int j = 0; j < sayi[i].length; j++){
                yeniArr[i]+= sayi[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));





    }
}

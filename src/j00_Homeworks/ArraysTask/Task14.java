package j00_Homeworks.ArraysTask;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";

            String strNew = str.replaceAll("\\D", "");
            String arr[] = strNew.split("");
            int toplam = 0;
            int a[] = new int[arr.length];
            for (int i = 0; i <= a.length - 1; i++) {
                a[i] = Integer.valueOf(arr[i]);
                toplam += a[i];
            }

        }

    }





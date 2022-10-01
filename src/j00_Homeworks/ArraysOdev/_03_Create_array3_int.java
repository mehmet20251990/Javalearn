package j00_Homeworks.ArraysOdev;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int numb[]= {25, 30, 30, 35, 100};
        int top=0;

        for (int i=0; i< numb.length; i++) {
            top+=numb[i];
        }
        System.out.println(top);
    }
}
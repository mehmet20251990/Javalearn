package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {

        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        static double toplam = 0;
        static ArrayList<Integer> sayi = new ArrayList<>();

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int str = 1;
            int girilensayi;

            while (str == 1) {
                System.out.print("Agamm sayi girip entera basarmısın : ");
                girilensayi = scan.nextInt();
                sayi.add(girilensayi);
                toplam += girilensayi;
                System.out.print("Agamm başka sayı girecekmisin? : evet için(1), hayır için (2)  seçip entera bas ");
                str = scan.nextInt();
            }
            ortalamaUstu();
        }//main sonu

        private static void ortalamaUstu() {
            double ort = toplam / sayi.size();
            System.out.println("Agamm girdigin sayıların ortalaması: "+ort);
            System.out.print("Agamm girdigin sayılardan Ortalamayı geçen sayılar : ");
            for (int i = 0; i < sayi.size(); i++) {
                if (sayi.get(i) > ort) {

                    System.out.print(sayi.get(i)+" ");
                }}
            System.out.println();
        }
    }//Class sonu







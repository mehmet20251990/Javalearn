package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Task02_ÖğrtNot {

          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        static double sum = 0;
        static ArrayList<Integer> scores = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int tercih = 1;
            int not;

            while (tercih == 1) {
                System.out.print("AĞAM not giresen: ");
                not = scan.nextInt();
                scores.add(not);
                sum += not;
                System.out.print("AĞAM daha not gireceksen? EVET=1 , HAYIR=0 ");
                tercih = scan.nextInt();
            }
            ortalamaUstu();
        }
        public static void ortalamaUstu() {
            double ort = sum / scores.size();
            System.out.println("Ortalama: "+ort);
            System.out.print("Ortalama üstü sayılar: ");
            for (int i = 0; i < scores.size(); i++) {
                if (scores.get(i) > ort) {
                    System.out.print(scores.get(i)+" ");
                }
            }
            System.out.println();
            System.out.println("Tüm sayılar: "+scores);
        }

    }


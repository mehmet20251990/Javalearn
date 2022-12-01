package j00_KodlarToplu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MethodsToplu {
    public static void methodsToplu() {
        Scanner sc = new Scanner(System.in);

        // Girilen ay nosuna göre kaç gün çektiğini primt eden code create et.

        System.out.print("kaçıncı ayda olduğunu gir: ");
        int ay = sc.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30");
                break;
            case 2:
                System.out.println("yılı gir");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("29");
                } else System.out.println("28");
                break;
            default:
                System.out.println(" hatalı rakam girdiniz");
                break;
            // TRİCK-> Girdiği CASEin sonunda break yoksa diğer CASEleri de okumaya devam eder...!!!
        }


        /* ternary
         String sonuc  =(sayı%2==0 ? "agam sayı ÇİFT" :"agam sayi TEK");//komut cıktısı String  type variable
          System.out.println("sonuc = " + sonuc);
         System.out.println(sayı % 2 == 0 ? "agam sayı ÇİFT" : "agam sayi TEK");
         */



        /*
        Girilen iki sayı arasındaki çift sayıları yanyana print eden code create ediniz.
         */
        System.out.println("iki pozitif tam sayı giriniz : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = (a < b ? a : b); i <= (a > b ? a : b); i++) {     //CİNCİK CODE......
            System.out.print(i % 2 == 0 ? i : " ");
        }


            /*
        While loop -> önce şart kontrol edilir, true alınırsa body action çalışır.
        do-While Loop -> önce body action çalışır sobra şart kontrol edilir.
                       Şart true ise döngü devam eder, şart flse ise döngü kırılır
                       ve döngüden sonraki ilk satır çalişir. Game app.de daha çok kullanılır.

        TRİCK -> while loop şart sağlanmazsa hiç çalışmayabilir.
                 do-While Loop şart sağlansın sağlanmasın en az bir kez çalışır.
*/
        int yas = 33;

        while (yas < 40) {
            System.out.println("while ->" + yas + " yaş");
            yas++;
        }

        do {
            System.out.println("do while ->  yaş" + yas);
            yas++;
        } while (yas < 33);


        int sayı = 1;
        System.out.println(faktoriyel(sayı));
        int maas = topla3(5, 6);

        // Array elemanı varlığını kontrol etme...
        int arr[]= {67,97,20,63,43,34,54,24,16,7,55,17};
        int arr4[]= new int[12];
        int sayii=33;

        boolean flag = false; // bayrak
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==sayii){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Array de var");
        } else {
            System.out.println("Array de yok");
        }
    }
    public static int topla3(int b, int a) {//int ve int parametreli inr return eden method
        return 2 * (a + b);
    }

    private static int faktoriyel(int sayı) { // void
        int faktoriyel = 1;
        for (int i = 1; i <= sayı; i++) {
            faktoriyel *= i;
        }   // System.out.println(faktoriyel);
        return faktoriyel;
    }
    public static int faktöriyel(int a) {
        if (a >= 1) {
            return a * faktöriyel(a - 1);// tekrar tekrar kendisini çağırıyor (Recursive)
        } else return 1;
    }
    /*
    Farklı class'tan method call etmek için
    1.Method static -> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
    aynı class'taki method doğrudan methodname() ile call edilir.
     */
    public static void forloop (int a) {
        //for each loop, for loop un gelişmiş halidir.
        List<Integer> sayıList = new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));
        for (int top : sayıList) {
            System.out.println(top);
        }
    }
}

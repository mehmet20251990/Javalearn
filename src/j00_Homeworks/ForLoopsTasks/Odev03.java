package j00_Homeworks.ForLoopsTasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
      bir method create ediniz.

     *  getAsalMi(int sayi)
     *  	return true/false
 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("sayı gir");
        int x= sc.nextInt();
        System.out.println(getAsalMi(x));
    }
    private static boolean getAsalMi(int x) {
        int toplam=0;
        boolean asalMı= true;
        for (int i=2; i<x ; i++){
            if (x%i == 0){
                toplam++;
            }
        }
        if (toplam>0){
          asalMı=false;
        }
        return asalMı;
    }
}

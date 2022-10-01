package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        /*
     substring()
     Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
     substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
     substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
     indexi'e kadar parçayı return eder
     baslangic indexi ==> inclusive/dahil
     bitis indexi ==> eclusive/haric
 */
        String str="java bilen sırtı yere gelmez :) ";
        System.out.println(str.substring(10)); //sırtı yere gelmez :)
        // str datasının son 10 karakterini print et.
        System.out.println(str.substring(str.length() - 10)); // gelmez :)

        // str datasının ilk 10 karakterini print et.
        System.out.println(str.substring(0, 10)); // java bilen

        // str datasının ilk karakterini print et.
        System.out.println(str.substring(0, 1)); // j

        // Task-> Girilen 4 harfki kelimeyi tersten print et

        Scanner sc =new Scanner(System.in);
        System.out.println("4 harfli kelime gir");
        String kelime= sc.nextLine();
        if (kelime.length()!=4){
            System.out.println("4 harfli kelime gir!!!!!");
        }else {
            System.out.print(kelime.substring(kelime.length() - 1));
            System.out.print(kelime.substring(2, 3));
            System.out.print(kelime.substring(1, 2));
            System.out.print(kelime.substring(0, 1));
        }



        }
}

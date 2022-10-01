package j00_Homeworks.tasks6;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz ");
        String cumle=sc.nextLine();
        System.out.println(cumle.contains(" "));
    }
}


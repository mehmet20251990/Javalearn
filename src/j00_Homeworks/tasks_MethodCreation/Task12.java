package j00_Homeworks.tasks_MethodCreation;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

      Scanner scan = new Scanner(System.in);
        System.out.println("email gir");
        String mail = scan.next();
        System.out.println(maildogru(mail));

    }

    private static boolean maildogru(String a) {

        boolean sonuc = true;

        if (a.contains("@")&&a.contains(".")&&a.charAt(a.indexOf('@')-1)>='a'&&a.charAt(a.indexOf('@')-1)<='z'){
            sonuc = true;
        } else sonuc = false;

        return sonuc;
    }
}
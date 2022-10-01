package j00_Homeworks.tasks_MethodCreation;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner scan=new Scanner(System.in);
        String a="javayı severim";
        System.out.println(hackerDili(a));



    }

    private static String hackerDili(String a) {
       a = a.replace('s','5');
       a = a.replace('e','3');
       a = a.replace('i','1');
       a = a.replace('a','4');
       a = a.replace('o','0');

       return a;
    }


}
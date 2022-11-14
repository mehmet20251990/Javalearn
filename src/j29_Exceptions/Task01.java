package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
     Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("pasword giresen");

        String password = sc.next();
        try {
            if (password.length()<6){
                throw new IllegalArgumentException("password uygun değil küçük");
            } else if (password.length()>10) {
                throw new IllegalArgumentException("password uygun değil büyük");
            }else
            System.out.println("agam password " + password);
        }
        catch (IllegalArgumentException e){
            System.out.println(e); // 16. ya da 18. satırdaki atamayı çağırır
            System.out.println("Agam yine mi hata :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");

    }
}

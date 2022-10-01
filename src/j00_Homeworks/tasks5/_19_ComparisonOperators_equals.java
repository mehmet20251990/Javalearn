package j00_Homeworks.tasks5;

public class _19_ComparisonOperators_equals {

    public static void main(String[] args) {

    /*    2 tane String oluşturun.
          String 1 "Apple" String 2 "Apple"
          İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.  */

        // Kodu aşağıya yazdırınız.

        String str1= "Apple";
        String str2= "Apple";

        boolean krstm = str1==str2;

        System.out.println(krstm);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


    }
}

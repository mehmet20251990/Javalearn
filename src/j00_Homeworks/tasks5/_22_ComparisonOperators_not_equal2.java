package j00_Homeworks.tasks5;

public class _22_ComparisonOperators_not_equal2 {

    public static void main(String[] args) {

    /*    2 String oluşturunuz.
          İlk String'in değeri "Techno Study", ikinci String'in değeri de "Techno Study" olsun.
          İlk String'in ikinci String'e eşit olmadığını doğrulayın. örn: (  !=    işareti ile)
          Eğer eşit değilse cevap true, eğer eşitse cevap false olacaktır.
          Cevabı yazdırın.  */

        //Kodu aşağıya yazınız.

        String x = "Techno Study";
        String y = "Techno Study";


        boolean krstm = x!=y;
        System.out.println(krstm);
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));

    }
}

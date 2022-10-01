package j06_Comparison_Karsılastırma_Operators;

public class C01_Comparison {
    public static void main(String[] args) {

        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */
        int a=33;
        int b=41;

        System.out.println("a=b mi " +(a==b)); // False
        System.out.println("a=b mi " +(a!=b)); // True
        System.out.println("a<b mi " +(a<b)); // True
        System.out.println("a<=b mi " +(a<=b)); // True

        String s1="kerem";
        String s2="Kerem";
        System.out.println(s1==s2); // False
/*
        s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise
        farklı nesneleri ifade eder. s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır
        ve  String constant pool üzerinde aynı adresi gösterirler. Böylece ekrana TRUE yazdırır.
*/

    }
}

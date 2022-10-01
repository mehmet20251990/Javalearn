package j04_AritmeticOperators;

public class C02_Increment_Decrement {
    public static void main(String[] args) {

        System.out.println("    **** Increment -> Arttırma *****    ");

        int a=7;

        System.out.println(++a); // 8
        System.out.println(a++); // 8  yazdırır sonra arttırır.
        System.out.println(a);   // 9
        System.out.println(a++ + ++a); // 20 -> önce a'yı yazdırır, sonra işlem devam ettiği için
                                      // diğer a'yı iki kere arttırmış


    }
}

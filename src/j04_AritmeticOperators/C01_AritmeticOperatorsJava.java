package j04_AritmeticOperators;

public class C01_AritmeticOperatorsJava {
    public static void main(String[] args) {

        int a=13;
        int b=17;
        int c=47;
        System.out.println(b+a*c);
        System.out.println(c-a/(b-c)+a*b);

        int g=2;
        int h=3;
        String s="JavaCAN";

        // TASK-> g h s variable'ları kullanarak 61JavaCAN-1 print et

        System.out.println(""+(g*h)+(h-g)+s+(g-h)); // 61JavaCAN-1


    }
}

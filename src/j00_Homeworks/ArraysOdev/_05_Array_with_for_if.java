package j00_Homeworks.ArraysOdev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        int numbers[]= {5,6,8,12,14,19};
        int top=0;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]%2==0){
                top+=numbers[i];
            }else top-=numbers[i];
        }
        System.out.println(top);


    }
}

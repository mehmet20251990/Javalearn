package j00_Homeworks.ArraysOdev;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String fruit[]={ "apple", "orange", "banana", "pineapple"};
        boolean flag=false;
        for (int i=0; i< fruit.length; i++) {
            if (fruit[i].contains("apple")){
                flag=true;
            }else flag=false;
        }
        System.out.println(flag);
    }
}

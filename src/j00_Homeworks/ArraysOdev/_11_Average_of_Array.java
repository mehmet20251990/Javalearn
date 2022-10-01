package j00_Homeworks.ArraysOdev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int num[]={12, 14 , 21 ,23 , 10 ,4};
        int top=0;
        for (int i=0; i<num.length; i++){
            top += num[i];
        }
        System.out.println(top/2);


    }
}
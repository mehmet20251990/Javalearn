package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // Task-> girilen datalarla int array elemanlarını büyükten küçüğe print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Array eleman sys ne");
        int arrBoyut = sc.nextInt();
        int arr[]= new int[arrBoyut];

        for (int i = 0; i < arrBoyut; i++){
            System.out.print(i+". index elemanı gir: ");
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // arr k-> b sıralandı...
        for (int i= arr.length-1/*en büyük sondaki elemandan döngü başlar*/;i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}

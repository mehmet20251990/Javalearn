package j00_Homeworks.ArraysTask;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
		int arr[] = { 1, 2, 3 };
		int yeni[] = new int[arr.length];
		System.out.println("eski array = " + Arrays.toString(arr));
		for (int i = 0; i <= arr.length - 1; i++) {
			yeni[(i + 2) % arr.length] = arr[i];
		}
		System.out.println("yeni array = " + Arrays.toString(yeni));

	}
}

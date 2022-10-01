package j00_Homeworks.Tasks4.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("sayı gir");
		int x= scan.nextInt();

		int toplam= (x%10)+(x/100);

		System.out.println(toplam);

	}

}

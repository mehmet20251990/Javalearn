package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
			Scanner sc = new Scanner(System.in);
		System.out.println("sayı gir");
		int x = sc.nextInt();
		int y=1;

		while (y<=x){
			System.out.println(x+"*"+y+"="+(x*y));
			y++;
		}
	}

}

package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("isim soyisim gir");
		String isim= sc.nextLine().trim();
		String soyisim= sc.nextLine().trim();
		String adsoyad=isim+soyisim;
		System.out.println(adsoyad);

		int x=0;
		while (x<adsoyad.length()){
			System.out.print(adsoyad.charAt(x)+" ");
			x++;
		}
	}
}

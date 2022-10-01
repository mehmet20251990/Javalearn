package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
		Scanner sc = new Scanner(System.in);
		int harfSayi = 0;
		int rakamSayi = 0;
		int karakterSayi = 0;
		System.out.print("Bir metin giriniz : ");
		String str = sc.nextLine();
		int index = 0;
		do {
			if ((str.charAt(index) >= 'a' && str.charAt(index)<='z') || (str.charAt(index)>='A' && str.charAt(index)<='Z')) {
				harfSayi++;
			} else if ((str.charAt(index) >= '0' && str.charAt(index)<='9')) {
				rakamSayi++;
			} else {karakterSayi++;}
			index++;
		}while(index < str.length());
		System.out.println("Harf Sayısı = " + harfSayi + " Rakam Sayısı = " + rakamSayi + " Karakter Sayısı = " + karakterSayi);
	}

}

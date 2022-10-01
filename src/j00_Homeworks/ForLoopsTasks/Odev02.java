package j00_Homeworks.ForLoopsTasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner sc= new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println(rakamSys(x));
	}
	private static int rakamSys(String x) {
		int toplam=0;
		for (int i=0; i<x.length(); i++){
			if (x.charAt(i)>='0' && x.charAt(i)<='9'){
				toplam++;
			}
		}
		return toplam;
	}
}

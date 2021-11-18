package day17_forloop;

import java.util.Scanner;

public class C06_forloopFaktr {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin
		// ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10 dan küçük bir sayı   giriniz...");

		int sayi = scan.nextInt();
		System.out.print(sayi + "!=");// kozmatik yaparak girdiğimiz sayının fak. işaret gelmesini istedik
		int fak = 1;

		for (int i = sayi; i > 1; i--) {
			fak *= i;
			System.out.print(i + "*");// fak*=i; ideğerini al fak içine çarp
		}

		System.out.print("1= girdiğiniz sayının faktoryeli :" + fak);

		scan.close();
	}

}

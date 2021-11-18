package day18_nestedForloop_whilel;

import java.util.Scanner;

public class C02_nestedForloop {

	public static void main(String[] args) {

		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
		// girdigi sayiya gore asagidaki sekli yazdirin
		// orn : 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10 dan küçük bir sayı   giriniz...");

		int sayi = scan.nextInt();

		for (int satır = 1; satır <= sayi; satır++) {// burasıda outerforloop--dış for loop
			for (int i = 1; i <= satır; i++) {// burası inner forloop---iç for loop
				System.out.print(i + " ");
			}
			System.out.println();
		}

	
	scan.close();
	
	}

}

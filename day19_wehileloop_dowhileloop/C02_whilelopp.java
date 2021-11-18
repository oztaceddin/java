package day19_wehileloop_dowhileloop;

import java.util.Scanner;

public class C02_whilelopp {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin
		// ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamını bulmak için pozitif tam sayı giriniz..:");

		int sayi = scan.nextInt();

		int rakamlarToplamı = 0;
		int rakam = 0;

		while (sayi > 0) {
			rakam = sayi % 10;
			rakamlarToplamı += rakam;
			sayi /= 10;
		}
		System.out.println("girdiğiniz sayının rakamlar toplamı :" + rakamlarToplamı);

		scan.close();

	}

}

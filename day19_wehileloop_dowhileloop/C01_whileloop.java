package day19_wehileloop_dowhileloop;

import java.util.Scanner;

public class C01_whileloop {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin
		// ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini
		// ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bölenlerini bulmak için pozitif tam sayı giriniz..:");

		int sayi = scan.nextInt();

		int sayac = 0;
		int bolen = 1;

		while (bolen <= sayi) {
			if (sayi % bolen == 0) {
				System.out.print(bolen + " ");

				sayac++;
			}

			bolen++;
		}
		System.out.println("");
		System.out.println(sayi + " sayısının " + sayac + " adet tam boleni vardır");
		scan.close();
	}

}

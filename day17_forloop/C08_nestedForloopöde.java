package day17_forloop;

public class C08_nestedForloopöde {

	public static void main(String[] args) {

		// 1 den 4 kadar olan sayıları yanyana
		// aralarında bir boşlık bırakarak yazdır

		// yıldız şeklinde pramit yap

		/*
		 * Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama
		 * gore asagidaki sekli cizdirin
		 *
		 * * * * * * *
		 */

		for (int satir = 1; satir <= 10; satir++) {// burasıda outerforloop--dış for loop
			for (int i = 1; i <= satir; i++) {// burası inner forloop---iç for loop
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

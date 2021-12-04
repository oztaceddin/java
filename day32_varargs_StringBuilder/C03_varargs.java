package day32_varargs_StringBuilder;

public class C03_varargs {

	public static void main(String[] args) {

		KafanaGoreIslem(5, 10, 13, 0);

		// varargs da hiç eleman olmassa java itiraz etmez
		// önce int olrak tanımlanan sayıları eşleştirir kalan tüm sayiları
		// varargs a doldurur

	}

	private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {

		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;

		}
		System.out.println("girilen sayıların toplamı: " + sayi1 * toplam);

	}

}

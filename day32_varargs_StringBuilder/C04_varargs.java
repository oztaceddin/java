package day32_varargs_StringBuilder;

public class C04_varargs {

	public static void main(String[] args) {
		topla(5, 8, 8, 13, 5, 0);

		// varargs dan önce farklı parametreler kullanıla bilir ama
		// varargs dansonra parametre yazılmaz
		// yazarsak eğer java vararg son parametre olmalıdır diye uyarırı
		// ve cte verir

	}

	private static void topla(int sayi1, int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;

		}
		System.out.println("girilen sayıların toplamı: " + toplam);

	}

}

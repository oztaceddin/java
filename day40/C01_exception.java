package day40;

public class C01_exception {

	public static void main(String[] args) {

		/*
		 * hata durumunda try { bu islemi yapmaya calis} catch (boyle bir hatayla
		 * karsilasirsan ) KODUN CALISMASINI DURDURMA { BU ISLEMI YAP VE YOLUNA DEVAM
		 * ET}
		 */

		int a = 20;
		int b = 0;// burda 0 a bölünme hatası verir

		try {
			System.out.println("sayıların bölümü: " + a / b);
		} catch (ArithmeticException e) {
			System.out.println("sıfıra bölüm olmaz ");
			// System.out.println(e.getMessage());/// by zero--exception nun kaynağını
			// gösterir
			e.printStackTrace();//java.lang.ArithmeticException: / by zero
			                    //at day40.C01_exception.main(C01_exception.java:17)

		}

		System.out.println("görev tamamlandı");

	}

}

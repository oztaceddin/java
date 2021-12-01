package day29_staticBlock_passByValue;

public class C03_passby_value {

	public static void main(String[] args) {
		// main method dan diğer methotlara veya diğer methodlardan main method a
		//bir variable gönderirseniz java orjinal variable leri değil
		//onların değerlerini(volue)götürü orjinal variable in değeri değişmez

		int fiyat = 100;

		

		System.out.println(indirimYap25(fiyat));// yazdırma verdiğimizde 75 yazd.
		// indirimi kalıcı yapmak için main method un içinde atama yapmalıyız

		System.out.println("method dan sonra main method daki diyat :" + fiyat);

		fiyat = indirimYap(fiyat);

		System.out.println("method dan sonra main method daki diyat :" + fiyat);
	}

	private static int indirimYap25(int fiyat) {
		fiyat *= 0.75;

		return fiyat;// burda yazdırma yok döndürme yapar bize
	}

	
	private static int indirimYap(int fiyat) {
		fiyat *= 0.90;
		System.out.println("%10 indirimli fiyat " + fiyat);
		return fiyat;
		
		
		
		
	
	}

}

package day29_staticBlock_passByValue;

public class C02_Passby {

	public static void main(String[] args) {
		// 100 tl satılan bir ürün için 2 farklı indirim uygulayan
		//2 method oluşturalım
		
		
		int fiyat=100;
		
		indirimYap(fiyat);
		indirimYap25(fiyat);
		
		System.out.println("method dan sonra main method daki diyat :" +fiyat);
	}

	private static void indirimYap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat "+ fiyat);
		
	}

	@SuppressWarnings("unused")
	private static void indirimYap(int fiyat) {
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat "+ fiyat);
		
	}

}

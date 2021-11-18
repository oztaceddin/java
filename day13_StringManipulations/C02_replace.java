package day13_StringManipulations;

public class C02_replace {

	public static void main(String[] args) {
		

	//String olarak verilen 10.000 sayýsýnýn binden
		//büyük olup olmadýgýný
		//yazdýrýn
	
	
	
	String sonuc="10.000";
	
	sonuc=sonuc.replace(".", "");
	//replace istediðimiz karakteri harfi istegimizle deðiþtirerek yazdýrýr
	
	
	if (Integer.valueOf(sonuc)>1000) {
		System.out.println("bulunan sonuc 1000 den cok");
	} else {
    System.out.println("bulunan sonuc 1000den az");
	}
	
	
	
	
	}

}

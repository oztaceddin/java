package day13_StringManipulations;

public class C02_replace {

	public static void main(String[] args) {
		

	//String olarak verilen 10.000 say�s�n�n binden
		//b�y�k olup olmad�g�n�
		//yazd�r�n
	
	
	
	String sonuc="10.000";
	
	sonuc=sonuc.replace(".", "");
	//replace istedi�imiz karakteri harfi istegimizle de�i�tirerek yazd�r�r
	
	
	if (Integer.valueOf(sonuc)>1000) {
		System.out.println("bulunan sonuc 1000 den cok");
	} else {
    System.out.println("bulunan sonuc 1000den az");
	}
	
	
	
	
	}

}

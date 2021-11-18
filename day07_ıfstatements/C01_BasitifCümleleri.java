package day07_ıfstatements;

import java.util.Scanner;

public class C01_BasitifCümleleri {

	public static void main(String[] args) {
	       /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = �Pazar, Pazartesi veya Persembe�             
            ilkHarf=S output = �Sali�
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen g�n isimlerinden birinin ilk harfini yaziniz  :");
		
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("pazar,pazartesi veya per�embe");
			
			
		}
		
		if (ilkHarf=='S') {
			System.out.println("sali");
			
			
		}
		
		if (ilkHarf=='C' || ilkHarf=='c' ) {
			System.out.println("carsamba,cuma veya cumartesi");
			
			
		}
		
		if (ilkHarf!='C' || ilkHarf!='P' || ilkHarf!='S') {
			System.out.println("Ge�ersiz Harf Girdiniz...L�tfen g�n isimlerinden birinin ba�harfini yaz�n�z..:");
		}
		
		scan.close();
		
		
	}

}

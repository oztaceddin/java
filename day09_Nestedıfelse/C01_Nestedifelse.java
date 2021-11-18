package day09_Nestedıfelse;

import java.util.Scanner;

public class C01_Nestedifelse {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
//Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
//Kullanicidan bir sifre girmesini isteyin
//Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. 
//Ilk harf A ise   �Gecerli Sifre�     degilse �Gecersiz Sifre� yazdirin.
//Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. 
//Ilk harf z ise   �Gecerli Sifre�     degilse �Gecersiz Sifre� yazdirin.		







      System.out.println("l�tfen bir �ifre giriniz:");
		
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {
			if (ilkKarakter=='A') {
				System.out.println("ge�erli �ifre");
			} else {
                System.out.println("ge�ersiz �ifre");
			}
			
			
		} else if(ilkKarakter>='a' && ilkKarakter<='z') {
			    if (ilkKarakter=='z') {
			    	System.out.println("ge�erli �ifre");
				} else {
					System.out.println("ge�ersiz �ifre");
				}

		}else {
			
			System.out.println("ge�erli �ifre olmas� i�in harf ile ba�lay�n�z...");
			
		}
		
		
		

	
	
	
	scan.close();
	
	
	
	
	
	
	}

}

package day09_Nestedıfelse;

import java.util.Scanner;

public class C02_Nestedifelse {

	public static void main(String[] args) {
		//Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
		//Girdiği sayi 5le  böl�n�yorsa son rakam�n� kontrol edin. 
		//Son rakam� 0 ise ekrana �5�e b�l�nen  �ift say�� yazd�r�n. 
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.  
		//Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.

		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamakl� pozitif bir say� giriniz:");
	
	    int sayi=scan.nextInt();
	    
	    if (sayi<1000  || sayi>9999) {
			System.out.println("l�tfen 4 basamakl� yaz�n�zzz...");
		} else {

		
		if (sayi%5==0) {
			if (sayi%10==0) {
				
				System.out.println("be�e tam b�l�nen �ift say�");
				
			} else {
				System.out.println("be�e tam b�l�nen tek say�");
			}
			
			
			
			
			
		} else {
              System.out.println("l�tfen tekrar deneyiniz...");
		}
		
		
		}
	
	
	scan.close();
	
	
	
}

}

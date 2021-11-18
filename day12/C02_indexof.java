package day12;

import java.util.Scanner;

public class C02_indexof {

	public static void main(String[] args) {
		 //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 //- Girilen kelime cumlede kullanilmamis.
		 //- Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1’den fazla kullanilmis.

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz  :");

	
	
	String cumle=scan.nextLine();
	System.out.println("lütfen varlýðýný kontrol etmek "
			+ "için bir kelime giriniz  :");
	
	String kelime=scan.nextLine();
	int index=cumle.indexOf(kelime);
	
	if (index<0) {
		System.out.println("girilen kelime cümlede kullanýlmamýþ");
	} else if(cumle.indexOf(kelime, index+1)<0){
		//<0 YAPMAMIZIN SEBEBÝ BÝR ÖNCEKÝ ÇALIÞAN ÝFTE 
		//CÜMLEYÝ BULDU SONRASINDA YOKSA ÝF BODY SÝNÝ ÇALIÞTIRMAK ÝÇÝN
        
		System.out.println("girilen kelime bir kere kullanýlmamýþ");
	
	}else {
		System.out.println("girilen kelime birden fazlaTA kullanýlmamýþ");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}

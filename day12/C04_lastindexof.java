package day12;

import java.util.Scanner;

public class C04_lastindexof {

	public static void main(String[] args) {
		

	
		 //Soru 2-4) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 //- Girilen kelime cumlede kullanilmamis.
		 //- Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1�den fazla kullanilmis.

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir c�mle giriniz  :");

	
	
	String cumle=scan.nextLine();
	System.out.println("l�tfen varl���n� kontrol etmek "
			+ "i�in bir kelime giriniz  :");
	
	String kelime=scan.nextLine();
	
	int ilkindex=cumle.indexOf(kelime);
	int sonidex=cumle.lastIndexOf(kelime);
	
	
	
	if (ilkindex==(-1)) {
		System.out.println("girilen kelime c�mlede kullan�lmam��");
	} else if(ilkindex==sonidex){
		System.out.println("girilen kelime c�mlede 1 kere kullan�lm��");
	}else {
		System.out.println("girilen kelime c�mlede 1 den fazla kullan�lm��");
	}
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}

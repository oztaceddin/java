package day12;

import java.util.Scanner;

public class C02_indexof {

	public static void main(String[] args) {
		 //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 //- Girilen kelime cumlede kullanilmamis.
		 //- Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1�den fazla kullanilmis.

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir c�mle giriniz  :");

	
	
	String cumle=scan.nextLine();
	System.out.println("l�tfen varl���n� kontrol etmek "
			+ "i�in bir kelime giriniz  :");
	
	String kelime=scan.nextLine();
	int index=cumle.indexOf(kelime);
	
	if (index<0) {
		System.out.println("girilen kelime c�mlede kullan�lmam��");
	} else if(cumle.indexOf(kelime, index+1)<0){
		//<0 YAPMAMIZIN SEBEB� B�R �NCEK� �ALI�AN �FTE 
		//C�MLEY� BULDU SONRASINDA YOKSA �F BODY S�N� �ALI�TIRMAK ���N
        
		System.out.println("girilen kelime bir kere kullan�lmam��");
	
	}else {
		System.out.println("girilen kelime birden fazlaTA kullan�lmam��");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}

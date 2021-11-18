package day08_ıfElseStatement;

import java.util.Scanner;

public class C05_ifElseif {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
		//sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		//sayilarin ikisi farkli isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� 
		//yazdirin, sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin.

	
		 Scanner scan=new Scanner(System.in);
			
         System.out.println("l�tfen iki sayi yaz�n�z\nilk say�dan sonra diger say� i�in enter yap�n:");
         
         double sayi1=scan.nextDouble();
         
         double sayi2=scan.nextDouble();
         
         
         
         if (sayi1>0 && sayi2>0) {
			System.out.println("say�lar�n toplam�:" + (sayi1+sayi2));
		} else if(sayi1<0 && sayi2<0){
			System.out.println("say�lar�n �arp�m�:" + (sayi1*sayi2));
		}else if(sayi1*sayi2<0){
			System.out.println("farkl� say�larla i�lem yapamass�n");
		}else {
			System.out.println("s�f�r �arpmaya g�re yutan elemand�r");
		}
	
	
	scan.close();
	
	}

}

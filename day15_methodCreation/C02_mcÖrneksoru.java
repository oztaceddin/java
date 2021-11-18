package day15_methodCreation;

import java.util.Scanner;

public class C02_mcÖrneksoru {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
            Kullanici 2,3 veya 4 degerini girerse, 
             kullanicidan bu sayilari girmesini isteyin 
             ve sayilarin toplamini yazdirin.
             Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse
             �Cok sayi girdiniz, ben toplayamam� yazdirin.
           */
	
	     Scanner scan=new Scanner(System.in, "ISO-8859-9");
       
        
		
		System.out.println("l�tfen toplamak isted�iniz say� adedini 2,3 veya 4"
				+ " den biri olarak se�in");
		
		int tercih=scan.nextInt();
		
	if (tercih>4) {
		tercih=5;
	}
		
		
		
    switch(tercih) {
	
	case 2:
		ikiSayiTopla();
		break;
	case 3:
	    ucsayiTopla();
	    break;
	case 4:
	    dortSayiTopla();
	    break;
	case 5:
	     System.out.println("�ok say� girdiniz,ben toplayamam");
	default:
	     System.out.println("ge�ersiz tercih");
	}
	
	
	
	
	
	
	
	
	scan.close();
	
	}

	private static void dortSayiTopla() {
		 Scanner scan=new Scanner(System.in, "ISO-8859-9");
			System.out.println("l�tfen d�rt say� girin\nhersay�dan sonra entere bas�n");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		System.out.println("girdi�iniz d�rt say�n�n toplam�: " + (sayi1+sayi2+sayi3+sayi4));
		
		scan.close();
		
	}

	private static void ucsayiTopla() {
		 Scanner scan=new Scanner(System.in, "ISO-8859-9");
			System.out.println("l�tfen �� say� girin\nhersay�dan sonra entere bas�n");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		System.out.println("girdi�iniz �� say�n�n toplam�: " + (sayi1+sayi2+sayi3));
		
		scan.close();
		
	}

	private static void ikiSayiTopla() {
		 Scanner scan=new Scanner(System.in, "ISO-8859-9");
		System.out.println("l�tfen iki say� girin\nhersay�dan sonra entere bas�n");
	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	
	System.out.println("girdi�iniz iki say�n�n toplam�: " + (sayi1+sayi2));
	
	scan.close();
	
	}

}
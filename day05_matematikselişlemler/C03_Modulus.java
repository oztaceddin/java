package day05_matematikselişlemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		
		
		//kulan�c�dan 3basamakl� birsay� al�p
		//rakamlar� toplam� yazd�ran program
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen 3 basamakl� bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		
		
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		rakamlarToplami+=sayi;
		
		System.out.println("girdi�iniz sayinin rakamlar toplam� :" + rakamlarToplami);
		
		
		
		
		
		scan.close();
		
		
		

	}

}

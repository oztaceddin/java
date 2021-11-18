package day05_matematikselişlemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen 4 basamakl� bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		
rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		System.out.println("girdi�iniz sayinin rakamlar toplam� :" + rakamlarToplami);
		
		scan.close();
	}

}

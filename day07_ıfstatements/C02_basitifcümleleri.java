package day07_ıfstatements;

import java.util.Scanner;

public class C02_basitifcümleleri {

	public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
	 
	 System.out.println("l�tfen bir tam sayi giriniz");
	 
	 int sayi=scan.nextInt();
	 
	 if (sayi%2==0) {
		System.out.println("girdi�iniz sayi cift bir sayi");
	
	 }
		
		
		if (sayi%2==1) {
		System.out.println("girdi�iniz sayi tek bir sayi");
		 
		 
		 
	}
	 
	 
	 
	 
	 
		scan.close();

	}

}

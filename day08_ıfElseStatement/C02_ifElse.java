package day08_ıfElseStatement;

import java.util.Scanner;

public class C02_ifElse {

	public static void main(String[] args) {
		//Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		
		if ((karakter>='A' && karakter<='Z') || ( karakter>='a' && karakter<='z')) {
			System.out.println("girdi�iniz: "+ karakter+ " bir harftir");
		} else {
			System.out.println("girdi�iniz: "+ karakter+ " bir harf de�ildir");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

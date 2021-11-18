package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C02_ternary {

	public static void main(String[] args) {
		
		//Kullanicidan bir tamsayi alin ve 
		//sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz:");
	   
	  int sayi=scan.nextInt();
	  
	  
	  
	System.out.println(sayi%2==0 ? "çift" :"tek sayi");
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	}

}

package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C02_ternary {

	public static void main(String[] args) {
		
		//Kullanicidan bir tamsayi alin ve 
		//sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz:");
	   
	  int sayi=scan.nextInt();
	  
	  
	  
	System.out.println(sayi%2==0 ? "�ift" :"tek sayi");
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	}

}

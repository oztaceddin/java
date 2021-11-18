package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_ternary {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, 
		//negatifse  sayinin karesini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz:");
	
	    double sayi=scan.nextDouble();
	    
	
	System.out.println(sayi>0 ? "sayi pozitif": (sayi*sayi) );
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	}

}

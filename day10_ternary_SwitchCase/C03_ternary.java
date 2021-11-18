package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_ternary {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve 
		//sayinin mutlak degerini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz:");
	
	    double sayi=scan.nextDouble();
	    
	    
	    double mutlakDeger=sayi>=0 ? sayi : (sayi*(-1));
	    
	    
	    System.out.println(mutlakDeger);
	
	
	scan.close();
	
	
	
	
	
	}

}

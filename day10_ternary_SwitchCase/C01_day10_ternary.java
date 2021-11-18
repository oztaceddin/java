package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_day10_ternary {

	public static void main(String[] args) {
		//Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz:");
	    double sayi1=scan.nextDouble();
	    
	    System.out.println("lütfen bir sayý daha giriniz:");
	    double sayi2=scan.nextDouble();
	
	     
	
	
	     System.out.println(sayi1>sayi2? sayi2:sayi1);
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	}

}

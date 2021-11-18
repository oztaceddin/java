package day04_incrementDecrement;

import java.util.Scanner;

public class c02_scanner {

	public static void main(String[] args) {
		
		// Ýsmin baþ harfi yazdýrma.
		
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Lutfen isminizi yaziniz");
		 
		 char ilkHarf=scan.next().charAt(0);
		 
		 System.out.println("isminizin ilk harfi : " + ilkHarf);
		 
		  
		 scan.close();
		 
	

	}

}

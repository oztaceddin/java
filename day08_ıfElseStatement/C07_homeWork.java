package day08_ıfElseStatement;

import java.util.Scanner;

public class C07_homeWork {

	public static void main(String[] args) {
	       Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen bir Gun ismi yaziniz");
	        
	        
	        String gun=scan.next().toLowerCase();
	                
	        if (gun.equals("pazartesi")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Par");
				
			} 
	        else if (gun.equals("sali")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Sal");
			} 
	        
	        else if (gun.equals("carsamba")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Car");
			} 
	        
	        else if (gun.equals("persembe")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Per");
			} 
	        
	        else if (gun.equals("cuma")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Cum");
			} 
			
	        else if (gun.equals("cumartesi")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Cum");
			} 
	        
	        else if (gun.equals("pazar")) {
				System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Paz");
			} 
	        else {
	        	System.out.println("Lutfen Gun ismini giriniz veya Turkce karakter kullanmadan gun ismini girin");
	        }
	    
	        scan.close();

	}

}

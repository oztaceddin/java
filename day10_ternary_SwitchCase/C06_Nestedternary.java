package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C06_Nestedternary {

	public static void main(String[] args) {
		//Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
		//buyuk harfse
		//consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

	
	
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char ilkHarf = scan.next().charAt(0);
        
        System.out.println( ((ilkHarf>='A' && ilkHarf<='Z') || 
        		(ilkHarf>='a' && ilkHarf<='z')) ? 
                ( (ilkHarf>='A' && ilkHarf<='Z') ? ("Buyuk Harf") : 
                ("Kucuk Harf") ) : ("Girdiginiz karakter harf degil") );
        
        
        scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

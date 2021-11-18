package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C09_SwitchCase {

	public static void main(String[] args) {
	       // Harf olarak girilen notu rakama cevirelim
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen harf notunusu  giriniz");
		char not=scan.next().toUpperCase().charAt(0);
		
		switch(not) {
		
		case'A':
		System.out.println("85---100 arasi");
		break;
		
		case'B':
			System.out.println("60---85 arasi");
			break;
		
		case'C':
			System.out.println("50---60 arasi");
			break;
		
		case'D':
			System.out.println("50DEN KÜÇÜK ");
			break;
		
		default:
			System.out.println("geçersiz");
		
		
		
		
		}

	
		scan.close();
	
	
	
	}

}

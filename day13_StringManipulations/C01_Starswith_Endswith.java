package day13_StringManipulations;

import java.util.Scanner;

public class C01_Starswith_Endswith {

	public static void main(String[] args) {
		//kullan�c�dan bir c�mle bir kelime al�n
		//verilen c�mlenin verilen kelime(char squence) ile baslay�p ba�lamad���n�
		//ve bitip bitmedi�ine bak
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz");
		
		String cumle = scan.nextLine();
		
		System.out.println("L�tfen bir kelime giriniz");
		
		String kelime = scan.nextLine();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen c�mle" + kelime+ " ile ba�l�yor");
		} else {
			System.out.println("girilen c�mle" + kelime+ " ile ba�lam�yor");
		}
			
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen c�mle" + kelime+ " ile bitiyor");
		} else {
			System.out.println("girilen c�mle" + kelime+ " ile bitmiyor");
		}

	
	
	
	
	scan.close();
	
	
	
	
	}

}

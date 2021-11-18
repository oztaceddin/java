package day13_StringManipulations;

import java.util.Scanner;

public class C01_Starswith_Endswith {

	public static void main(String[] args) {
		//kullanýcýdan bir cümle bir kelime alýn
		//verilen cümlenin verilen kelime(char squence) ile baslayýp baþlamadýðýný
		//ve bitip bitmediðine bak
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz");
		
		String cumle = scan.nextLine();
		
		System.out.println("Lütfen bir kelime giriniz");
		
		String kelime = scan.nextLine();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cümle" + kelime+ " ile baþlýyor");
		} else {
			System.out.println("girilen cümle" + kelime+ " ile baþlamýyor");
		}
			
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cümle" + kelime+ " ile bitiyor");
		} else {
			System.out.println("girilen cümle" + kelime+ " ile bitmiyor");
		}

	
	
	
	
	scan.close();
	
	
	
	
	}

}

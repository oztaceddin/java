package day17_forloop;

import java.util.Scanner;

public class C04_palindrome {

	public static void main(String[] args) {
		//Soru 9 ) Interview Question Kullanicidan bir String isteyin.
       // Kullanicinin girdigi String’in palindrome 
       // olup olmadigini kontrol eden bir program yazin.	
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdırmak için bir kelime  giriniz...");
	
	    String str=scan.nextLine();
	
	if (str.equals(tersineCevir(str))) {
		System.out.println("girdiğiniz palindrome");
	}else {
		System.out.print("girdiğiniz palindrome değil :");
	}

	//palindrome tersten ve düz aynı olan
	System.out.println(tersineCevir(str).toUpperCase());
	scan.close();
	
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		//ters çevlicek kelimeleri alacak
		for (int i = str.length()-1; i >=0; i--) {
			
			tersStr+=str.substring(i,i+1);
		
		//length-1 ile son harfi alı tersstr ekleyerek yazdıracak
			//substring yaparakta son harfe ekleyecek
		}
		
		return tersStr;
		
		
	}

}

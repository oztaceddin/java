package day17_forloop;

import java.util.Scanner;

public class C03_forloop {

	public static void main(String[] args) {
		//Soru 8 ) Interview Question Kullanicidan bir String isteyin 
        //ve Stringi tersine ceviren bir method yazin.

	
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdırmak için bir kelime  giriniz...");
	
	    String str=scan.nextLine();
	
	

	
	System.out.println(tersineCevir(str));
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

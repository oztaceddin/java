package day08_ıfElseStatement;

import java.util.Scanner;

public class C01_ıfElse {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("l�tfen dikdortgen diger uzunlugunu giriniz:");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen �l��ler karedir");
		} else {

			
			System.out.println("girilen �l��ler kare de�ildir");
			
		}
		
		scan.close();
		
		
		
		

	}

}

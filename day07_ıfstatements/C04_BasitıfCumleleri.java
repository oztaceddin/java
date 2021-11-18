package day07_ıfstatements;

import java.util.Scanner;

public class C04_BasitıfCumleleri {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("l�tfen dikdortgen diger uzunlugunu giriniz:");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdorgen kare");
		}
		
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdorgen kare degil");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}

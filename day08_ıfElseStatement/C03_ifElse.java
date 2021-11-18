package day08_ıfElseStatement;

import java.util.Scanner;

public class C03_ifElse {

	public static void main(String[] args) {
		//Kullaniciya yasini sorun, eger yas 65�den kucuk ise 
		//�emekli olamazsin, calismalisin�, 
		//65�den buyukse �Emekli olabilirsin� yazdirin
		
         Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen ya��n�z� giriniz :");
		
		
		int yas=scan.nextInt();
		
		
		
		
		if (yas<65) {
			System.out.println("emekli olamazs�n ,�al��mal�s�n");
		} else {
			System.out.println("emekli olabilirsin");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}

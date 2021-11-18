package day08_ıfElseStatement;

import java.util.Scanner;

public class C09_Nestedif {

	public static void main(String[] args) {
		

	//ege �al��an kad�nsa 60ya��ndan b�y�k oldugunda emekli olabilir
	//�al�san erkekse 65 yas�ndan b�y�kse emekli olabilir
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("l�tfen cinsiyetinizi giriniz\nerkek i�in E,kad�n i�inK");
	
         char cinsiyet=scan.next().toUpperCase().charAt(0);
         
	      System.out.println("l�tfen ya��n�z� giriniz");
	     double yas=scan.nextDouble();
	     
	     if (cinsiyet=='E') {
			
		if (yas>65) {
			System.out.println("emekli olabilirsi");
		} else {
             System.out.println("emekli olamass�n");
		}
			
	     
	     
	     
	     } else if(cinsiyet=='K'){

		if (yas>60) {
			System.out.println("emekli olabilirsin");
		} else {
          System.out.println("emekli olamass�n");
		}
	     
	     
	     }else {
			
		
	     
	     
	     }
	
	
	
	scan.close();
	
	
	
	
	
	}

}

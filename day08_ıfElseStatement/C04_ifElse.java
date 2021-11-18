package day08_ıfElseStatement;

import java.util.Scanner;

public class C04_ifElse {

	public static void main(String[] args) {
		 // Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
        // eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen"
        //diger durumlarda ekrana "Eskenar ucgen degil" yazdir
		
		
          Scanner scan=new Scanner(System.in);
		
          System.out.println("l�tfen ��genin kenar uzunluklar�n� yaz�n�z \nilk kenar� girdikten sonra di�er kenarlar i�in enter yap�n:");
          
          double kenar1=scan.nextDouble();
          
          double kenar2=scan.nextDouble();
		
		
          double kenar3=scan.nextDouble();
          
          
          
          if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("e�kenar ��gendir");
		} else {
          System.out.println("e�kenar de�ildir");
		}
		
		
		
		
		scan.close();
		
		
		
		

	}

}

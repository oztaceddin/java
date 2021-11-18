package day07_ıfstatements;

import java.util.Scanner;

public class C03_Basitifcumleleri {

	public static void main(String[] args) {
		   /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen hafta i�i veya hafta sonu oldu�unu yaz�n�z:");
		
		String gun=scan.next().toLowerCase();
		
		
		if (gun.equals("pazar")|| gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
		
		
		if (gun.equals("pazartesi")|| gun.equals("sal�")
				|| gun.equals("carsamba")|| gun.equals("persembe")
				|| gun.equals("cuma")) {
			System.out.println("Hafta ici");
		}
	
	
	
		scan.close();
	
	
	}
	


}

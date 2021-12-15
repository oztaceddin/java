package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {

		// kullanıcıdan istediği kadar sayı alıp
		// bu sayıları toplayan bir program yapınız
		// sayı girişini bitirmek için q ya basın

		int sayi = 0;
		int toplam = 0;
		int sayac=0;

		Scanner scan = new Scanner(System.in);
		//InputMismatchException
		
		try {
			
			while (sayac<10000) {
				System.out.println("lütfeb toplam için bir sayı yazınız \nbitirmek için sayı dışında bir tuşa basınız");
				sayi = scan.nextInt();
				toplam += sayi;
				sayac++;
			}		
			
		} catch (InputMismatchException e) {
			
			System.out.println("girdiğiniz :"+sayac+" adet sayıların toplamı:"+toplam);
		
		}

	

		
		
		scan.close();
		
	}

}

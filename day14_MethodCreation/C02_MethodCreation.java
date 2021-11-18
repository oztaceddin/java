package day14_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		//kullanıcıdan 2 sayı isteyin
		//sayıların karelerini ve kıplerini toplayan 2 ayrı method yazın
		//kullanıcıya ıs sorun 
		//2 yazarsa kareleri toplamı method 3 yazarsa kıpler toplamı yapan methot ıalıısın
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lıtfen 2 sayı giriniz:\nilksayıdan sonra entere basın  ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		System.out.println("girilen sayıların kareler toplamını istiyorsanız 2\n"
				+ "kupler toplamı iıin 3 e basınız");
		int secim=scan.nextInt();
		
		switch(secim) {
		
		 case 2:
		       karetopla(sayi1,sayi2);
		       break;
		 case 3:
			   kupTopla(sayi1,sayi2);
			   break;
		default:
			System.out.println("lıtfen istenen tercihlerden birini yapın");
			 
		
		}
		
		
		
		/*bit methodu 4 adımda oluı
		 * 1-methodu oluıtura bilmek iıin method call yapıyoruz
		 * 2-arguman ihtiyacı varmı belirleriz
		 * 3-javadan yardım alarak method oluıturalım
		 * 4-axcess modifier ve retun type karar ver
		 * bundan sonra methodun yapacagı iıleri gerıekleıece kodları yazmalıyız
		 *  */
		scan.close();
      
		}

	public static void kupTopla(double sayi1, double sayi2) {
		
		double kuplerToplamı=sayi1*sayi1*sayi1 +sayi2*sayi2*sayi2 ;
		System.out.println("girilen sayıların kupleritoplamı top = " + kuplerToplamı);
	
	
	
	}

	private static void karetopla(double sayi3, double sayi4) {
		//bizim arguman ismiyle parametre ismi aynı olmak zorunda deıil
		//java isimlere deıil deıerlere bakar
		
      double karelerToplamı=sayi3*sayi3 +sayi4*sayi4;
	System.out.println("girilen sayıların karelerei top = " +karelerToplamı);
	
	
	
	
	
	}




}

package day14_MethodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
        //verilen 2 sayının toplamı ve ıarpımını yapan
		//ve yazdıran 2 ayrı method oluıtur

	//method oluıturmak iıin 3 adımı takip et
		//1.adım method call
		//2.adımmethoda argıman yazacakmıyız karar vermeliyiz
		
		
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1,sayi2);//method call
		//3.adım 1. ve 2. adımı yaptıktan sonra javadan yardım alıp methodu oluıtururuz
	
	     carpma(sayi1,sayi2);
	
	
	
	}

	public static void carpma(int sayi1, int sayi2) {
		
		System.out.println("sayıların ıarpımı :"+ (sayi1*sayi2));
	
	
	
	}

	private static void toplama(int sayi1, int sayi2) {
		//4.adımeriıim dızenleyici ve return type a karar vermeliyiz
		//eriıim dızenleyici axcess modifier:(kimler kullanmalı-public yaptık
		//return type:bizden sadece yazdırma istediıi iıin VOıD kalabilir
		
		System.out.println("sayıların toplamı :" + (sayi1+sayi2));
		
	}

}

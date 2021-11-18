package day19_wehileloop_dowhileloop;

import java.util.Scanner;

public class C03_forloop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamını bulmak için pozitif tam sayı giriniz..:");


		int sayi = scan.nextInt();

		int rakamlarToplamı = 0;
		int rakam = 0;
		
		rakamlarToplamı=0;
		String sayiStr=""+sayi;
		//int olarak verilen bir sayının basamak sayısını bulmak için
		//kısa yoldan o sayıyı stringe çevirip str.lenght metodunu kullanabiliriz
		for (int i = 0; i <sayiStr.length() ; i++) {
			rakam = sayi % 10;
			rakamlarToplamı += rakam;
			sayi /= 10;
		}
		System.out.println("girdiğiniz sayının rakamlar toplamı :" + rakamlarToplamı);
		
	
	
	
	
	
	scan.close();
	}

}

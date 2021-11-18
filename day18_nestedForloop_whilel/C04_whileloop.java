package day18_nestedForloop_whilel;

import java.util.Scanner;

public class C04_whileloop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devap edin
		// kullanici sifira bastiginda,
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin

		Scanner scan = new Scanner(System.in);
		// loopun içinde kullanacagımız obje ve variableleri looptan önce
		// oluşturmak daha iyidir
		// çünkü loop her döndüğünde yeni bir obje veya variable oluşturmak gerekli
		// buda hafızayı doldurur

		int sayi = 1;
		int toplam = 0;
		int sayac = 0;

		while (sayi != 0) {

			System.out.println("Lütfen toplama eklemek için bir tam sayı yazın: \nbitirmek için 0 a basın:");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

		}

		// kullanıcı 0 a bastığında işlevini sonkez yazıp
		// sonra sonra basa dönecek ve loop bitecek
		
		//sıfırı toplamak üzere vermediği için sadece bitirmek için verildiğinden sıfırı sayaca 
		//eklememek için 38.satırda sayac-1 yapıyoruz
		System.out.println("girilen sayı adedi :"+ (sayac-1));
		System.out.println("girilen sayıların tplamı :"+ toplam);

	
	scan.close();
	
	
	}

}

package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_datetime_formatter {

	public static void main(String[] args) {
		LocalDateTime tarihSaat = LocalDateTime.now();

		System.out.println(tarihSaat);// 2021-12-02T23:44:32.680219300

		// eğer tarih veya saati kendi istediğimiz biçimde yazdırmak istersek
        //gün / ay / yıl  saat:dakika
		
		
//		 * yy:   Yilin son iki rakamini
//		 * y:    Yilin tamamini
//		 * M:    Ay sirasini verir
//		 * MM:   Ay sirasini verir
//		 * MMM:  Ay isminin ilk uc harfini verir
//		 * MMMM: Ay isminin tamamini verir
//		 *
//		 *  Ay buyuk M ile belirtilmeli dakika( minute) ile
//		 *  cakismamasi icin.
		//EEEE---günü veriyor
		//
		

		
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / MMMM / YYYY / eeee HH:mm ");

	System.out.println(duzenle.format(tarihSaat));//02 / 12 / 2021 23:52 
	
	/*
	 format olustururken
	 GUN
	 d : basta 0 varsa onu yazmadan gun numarasi
	 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
	 DDD : yilin kacinci gunu oldugunu yazar
	 E, EE, EEE : gun isminin ilk 3 harfi
	 EEEE : gun isminin tamamini 
	 
	 AY (Ay icin M, dakika icin m kullanilir)
	 M : basta 0 varsa onu yazmadan ay numarasi
	 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
	 MMM : Ay isminin ilk 3 harfi
	 MMMM : Ay isminin tamami
	 
	 YY : yilin son iki rakamini
	 YYYY : Yilin tamamini
	 
	 
	 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
	 
	 HH : saatin tamami, tek rakamli saat olursa 02 gibi
	 H  : tek rakamli saat olursa sadece saati
	 
	 a yazarsak AM veya PM degerini yazar
	 
	 
	 */
	
	
	
	}

}

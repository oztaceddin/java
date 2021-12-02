package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class C04_DateTİme {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// bir string ve bir integer variable oluşturalım
		// bir loop içerisinde variable ları 1000 kere değiştirelim ve
		// işlem sürelerini kıyaslayalım

		// verilen iki doğum tarihinin hangisinin daha önce olduğunu bulunuz

		LocalTime saat = LocalTime.now();
		System.out.println("başlangıç saati" + saat);
		int sayi = 10;

		for (int i = 0; i < 100000; i++) {
			sayi++;
		}

		LocalTime saat1 = LocalTime.now();
		System.out.println("bitiş saati saati" + saat1);

		double nano1=saat.getNano();
		double nanoBitiş=saat1.getNano();
		
		
		System.out.println("for loop "+(nanoBitiş-nano1)+"saniyede tamamladı");
	
	
	System.out.println("***********stringli************");
	
	
	LocalTime saatS = LocalTime.now();
	System.out.println("başlangıç saati" + saatS);
	String str="celil";

	for (int i = 0; i < 100000; i++) {
		str+=" ";
	}

	LocalTime saat1s = LocalTime.now();
	System.out.println("bitiş saati saati" + saat1s);

	double nano1S=saatS.getNano();
	double nanoBitişs=saat1s.getNano();
	
	
	System.out.println("for loop "+(nanoBitişs-nano1S)+"saniyede tamamladı");
	
	
	
	}

}

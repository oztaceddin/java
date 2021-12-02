package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_localtime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	
		LocalTime saat = LocalTime.now();
		System.out.println("başlangıç saati"+saat);///23:03:23.379824600
	
	int sayi=10;
	
	for (int i = 0; i < 10000; i++) {
		sayi++;
	}
	
	LocalTime saat1 = LocalTime.now();
	System.out.println("bitiş saati saati"+saat1);//23:09:17.296264900
	
	//eğer bir işlemin başlangıç ve bitiş zamanının kaydetmek istiyorsak
	//hem başında hem sonunda localtime objesi oluşturmalıyız
	
	
	double nano1=saat.getNano();
	double nanoBitiş=saat1.getNano();
	
	
	System.out.println("for loop "+(nanoBitiş-nano1)+"saniyede tamamladı");
	
	
	System.out.println(saat.getMinute());//28
	System.out.println(saat.plusHours(5));//04:29:39.216811300
	System.out.println(saat.plusMinutes(10000));//22:10:15.335150500
	
	System.out.println(saat.minusMinutes(800));//10:11:38.288836200---önce demek
	
	
	LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
	System.out.println(yerelSaat);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

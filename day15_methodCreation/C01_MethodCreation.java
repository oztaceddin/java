package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri
		//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
		//   kalan harfler * olacak sekilde birlestirsin
		
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin

		Scanner scan=new Scanner(System.in, "ISO-8859-9");
        
		
		System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim =scan.nextLine();
	
	    System.out.println("isminizin açýk yazýlmasýný istiyorsanýz 1\n"
			+ "gizli yazýlmasý için 2 ye basýnýz");
	
	    int tercih=scan.nextInt();
	
	    
	    
	    
	    String birlesmisIsim=null;//t******* ö*
	
	if (tercih==1) {
		birlesmisIsim=acikIsim(isim,soyisim);
		
	} else if(tercih==2){
		birlesmisIsim=isimGizle(isim,soyisim);
	}else {
		System.out.println("lütfen 1 yada 2");
	}
	
	
	// Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak
    // kaydedildi
	
	
	System.out.println("kullanýcý tercihi :"+ birlesmisIsim );
	
scan.close();
	}

	public static String isimGizle(String isim, String soyisim) {
		
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim +""+ soyisim  ;
		
		

	}

	
	
	  public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase()  + isim.substring(1).toLowerCase();
		
		soyisim=soyisim.substring(0,1).toUpperCase()  + soyisim.substring(1).toLowerCase();
		
		
		return isim +""+ soyisim;
		
		
	}





}

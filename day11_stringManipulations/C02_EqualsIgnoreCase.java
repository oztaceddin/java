package day11_stringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		//EqualsIgnoreCase 2 stringi karğğlağtğrğrken 
		//case sensitive olmadan kğyaslama yapar
		
		
		String str1="ali";
		String str2="can";
		String str3="ALİ CAN";
		String str4=str1 + " "+str2;
	
		System.out.println(str4);//ali can
		System.out.println(str3==str4);//false denkğ değer ve referanslarğ farklı	
	    System.out.println(str3.equals(str4));// false değerleri farlı
	
	System.out.println(str3.equalsIgnoreCase(str4));//true bğyğk kğğğk harf bakma boğluklar önemli
	
	
	
	
	
	
	}

}

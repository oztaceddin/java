package day04_incrementDecrement;

public class C03_AutoWideningjava {

	public static void main(String[] args) {
		
		        // esitligin sol tarafi short, sag tarafi byte 
				// iki data turu farkli oldugu halde java itiraz etmiyor
				// cunku atama yapilan variable'in data turu (short) 
				// atanan degerin veri turunden (byte) buyuk oldugundan sorun olusmaz
		
		
		
		
		byte sayi1=27;
		
		short sayi2=sayi1;
		
		
		System.out.println("sayi2 : " + sayi2);
		
		
		int sayi3=45;
		
		double sayi4=sayi3;
	   
		System.out.println("sayi4 : " + sayi4);
		
		

	}

}

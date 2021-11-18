package day04_incrementDecrement;

public class C04_ExpilicitNarrowing {

	public static void main(String[] args) {
	
		int sayi1=795;
		
		short sayi2= (short) sayi1;
		
	System.out.println("sayi2:" + sayi2);	
	
	
	byte sayi3=(byte) sayi2;
	
	System.out.println("sayi3 :" + sayi3);
	 
	// byte---128 den + 127 kadar
	
	double sayi4=95.6;
	
	int sayi5= (int) sayi4;
	
	System.out.println("sayi5 :" + sayi5);
	
	
	int sayi6=27;
	
	int sayi7=4;
	
	System.out.println(sayi6/sayi7);
	
	double sayi8=4;
	
	double sayi9=17;
	
	
	System.out.println(sayi6/sayi8);
	
	System.out.println(sayi9/sayi7);
	
	

	
	
	
	
	
	

	}

}

package day32_varargs_StringBuilder;

public class C01_varargs {

	public static void main(String[] args) {
		

		topla(5,8,8,13,5,0);
		
		//varargs list gibi davranır ama
		//array methodları ile çalışır
	
		
	}

	private static void topla(int...sayilar) {
		int toplam=0;
		
		
		for (int each : sayilar) {
			toplam+=each;
		
		
		}
		System.out.println("girilen sayıların toplamı: "+toplam);
		
	
	
	
	
	
	
	
	
	
	}

}

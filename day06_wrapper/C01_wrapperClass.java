package day06_wrapper;

public class C01_wrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;
		Integer sayi2=20;
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);
		
		System.out.println("toplam :"+(Integer.valueOf(tel1)+Integer.valueOf(tel2)));

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		
		String caddeNo="b203";
		String sokakNo="1564";
		
		// System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(caddeNo));
		//hata verir sadece numerik ifadeler
		
		String caddeNo1="203";
		String sokakNo1="1564";
		
		System.out.println(Integer.valueOf(caddeNo1)+Integer.valueOf(sokakNo1));
		
		
		
	}

}

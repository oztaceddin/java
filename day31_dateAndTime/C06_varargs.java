package day31_dateAndTime;

public class C06_varargs {

	public static void main(String[] args) {
		//verilen sayıları tplayan bir methot oluşturalım
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		
		
		
		topla(a,b);//iki sayının toplamı 30
		topla(a,b,c);//üçsayının toplamı 60
		topla(a,b,c,d);//varargs çalışır 
		topla(a,b,c,d,e);//varargs çalışır 
		topla(a,b,c,d,e,f);//varargs çalışır 
		
		//suana kadar gördüğümüz tekniklerle değişken sayıda parametreli tek bir method yapamayız
	    //variaty arguments
	
	
	
	
	}

	private static void topla(int... a) {
		System.out.println("varargs çalışır ");
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println("üçsayının toplamı "+(a+b+c));
		
	}

	private static void topla(int a, int b) {
		System.out.println("iki sayının toplamı "+(a+b));
		
	}

}

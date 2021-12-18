package day43_Interface;

public interface C02_Interface {

	void motor();// normal classlarda access modifier yazmassak java default access mod. kabul
					// eder

	// interface de ise access modifier yazmassak java public olarak kabul eder.

	 int sayi = 10;// private olmaz--public static ve finel olabilir
					// otomatik olarak finel ve static olarak kabul ediyor


	
	//interface de body si olan bir nethod yazmak istersek
	//java bize 2 alternatif sunar
	//1-method un basına "default" keyword yazabiliriz
	//ancak burada yazılan default access modifier değil javanın interface için
	//özel kabul ettiği
	
	
	
	
	
	
	
	
	
	public default void kaporta() {
		System.out.println("default keyword sayesinde body oluşturabildim");

	}
	
	
	public static void sanzuman() {
		System.out.println("statik keywordile method oluşturdum");
	}
	
	
	

}

package day39_overridingKurallari_polymorphism;

public class C02 extends C01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethod();

		C01 obj2 = new C02();
		//obj2.privateMethod();
		
		//data turü c01 olduğundan öncelikle c01 classındaki
		//method a bakmamız gerekir ancak private olduğundan ulaşamayız
		//ulaşamadığımız bir method u override yapamayız
	
		//dolayısıyla signature aynı olmasına ragmen bu iki 
		obj2.staticMethod();

         //static methodlar override edilemez
	
	
	
	
	}

	
	
	
	
	
	
	public static void staticMethod() {
		System.out.println("child class static method çalıştı");
	}


	
	
	
	
	// @Override private overrride olmaz yapmasınada izin vermez

	private void privateMethod() {
		System.out.println("child class private Method");
	}

	/*
	 * public final void finalMethod() {
	 * System.out.println("parent class final Method"); }
	 */

}

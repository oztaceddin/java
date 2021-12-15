package day39_overridingKurallari_polymorphism;

public class C01 {

	public static void staticMethod() {
		System.out.println("parent class static method çalıştı");
	}
	
	
	@SuppressWarnings("unused")
	private void privateMethod() {
		System.out.println("parent class private Method");
	}
	//final demek bu son hali bir daha değiştirelemez
	//dolayısıyla final olarak tanımlanan bir method
	//override edilemez
	
	
	
	public final void finalMethod() {
		System.out.println("parent class final Method");
	}
	
	
	//child class ile parent class aynı package olduklarından
	//methotların access modifier ları public -protected veya default olsaydı
	//hiç bir problem olmazdı
	
	
	
	
	
}

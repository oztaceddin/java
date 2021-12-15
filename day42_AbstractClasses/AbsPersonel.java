package day42_AbstractClasses;

public abstract class AbsPersonel {
	
	//class ve methodu  abstract olarak tanımladığımızda child classlar mecbur olarak
	//bu methodu override edecektir
	
	public abstract void statu();
	
	
	
	public void concreteMethod() {
		System.out.println("personel classdaki concrete method çalıştı");
	}
		
	

}

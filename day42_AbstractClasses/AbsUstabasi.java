package day42_AbstractClasses;

public class AbsUstabasi extends absIssi {
	
	//concrete bir child class parent i olan bir abstract class lardaki 
	//tüm abstract methodları implement yapmalı
	
	//ama parent i olan bir abstract class lardaki concrete methodları 
	//implement etmek zorunda değildir

	public static void main(String[] args) {
		
		AbsUstabasi ust1=new AbsUstabasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
		
		//Eger bir class'dan OBJE OLUSTURULMASINI istemiyorsak ve bu class'i 
		//sadece CHILD CLASS'larin yapmalari gereken gorevleri belirlemek icin 
		//kullaniyorsak abstraction yapariz

	}

	@Override
	public void mesai() {
		
		System.out.println("ustabaşı arıza durumunda arıza çözülenekadar çalışır,,imza ustabaşı");
	}

	@Override
	public void maas() {
		System.out.println("ustabaşıları aylık 10000 maaş alır,,imza ustabaşı");
		
	}

	@Override
	public void statu() {
		System.out.println("bu classdaki tüm personel ustabaşıdır,,imza ustabaşı");
		
	}
	
	

}

package day42_AbstractClasses;

public class Ustabası extends Isci {
	
	public void statu() {
		System.out.println("bu classdaki tüm personel ustabaşıdır,,imza ustabaşı");
	}
	
	
	public void maas() {
		System.out.println("ustabaşıları aylık 10000 maaş alır,,imza ustabaşı");
	}
	
	public void mesai() {
		System.out.println("ustabaşı arıza durumunda arıza çözülenekadar çalışır,,imza ustabaşı");
	}
	
	
	//obje oluşturduğumuz enalttaki class parent classlardaki methodları
	//override edince classdan oluşturulan objeler en doğru ve spesifik bilgilere kavuştu
	
	//ama klasik parent-child ilişkisinde tüm methodları override etme mecburiyeti yoktur
	
	//java parent classlardaki tüm methodları override etmek mecburiyeti kazandırmak için
	//Abstractclass yapısını oluşturmuştur
	//yani bir classı Abstract olarak tanımlarsak child classlar tüm methodları override etmek zorundadır
	
    //dolayısıyla Abstract yaptığımız parent classlar sadece kalıp görevi yapacaklar
	
	
	public static void main(String[] args) {
		
		
		Ustabası ust1=new Ustabası();
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
		
		

	}

}

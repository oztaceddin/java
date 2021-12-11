package day35_encapsulation_ininheritance;

public class C02_setter {

	public static void main(String[] args) {
		
		//öğretmenler öğrenci notunu girsin ama
		//tüm notları göremesin
		//sadece geçip geçemediğini görsün
		
		
		
		C01 ogr1=new C01();
		
		
		ogr1.isGecerMi();
		System.out.println(ogr1.isGecerMi());//false
		
		
		ogr1.setNot(50);
		
		
		System.out.println(ogr1.isGecerMi());//true
		
		
	}

}

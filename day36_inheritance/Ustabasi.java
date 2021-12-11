package day36_inheritance;

import day35_encapsulation_ininheritance.Isci;

public class Ustabasi extends Isci {

	Ustabasi() {
		System.out.println("ustabaşı parametresiz constructor çalıştı");
	}

	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		
		//javada her class oluşturulduğunda otomatik olarak
		//default constructor oluştuğu gibi
		//Child class da oluşturulan her bir constructor ında
		//ilk satırında  gizli super() const oluşrt.
      
		
	}

}

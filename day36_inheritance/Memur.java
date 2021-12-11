package day36_inheritance;

import day35_encapsulation_ininheritance.Muhasebe;

public class Memur extends Muhasebe  {

	public static void main(String[] args) {

		Memur memur1 = new Memur();
		
		
		memur1.isim="hasan";
		memur1.saatUcreti=16;
		
		memur1.maas=memur1.maasHesapla();
		
		System.out.println(memur1.isim + "'in maaşı :" + memur1.maas);
		
		

	}

}

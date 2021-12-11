package day35_encapsulation_ininheritance;

public class Isci extends Muhasebe {

	protected String statu;
	protected String meslek;
	protected String sendika;
	
	public Isci(){
		System.out.println("işçi parametresiz const. çalıştı");
	}

	
	
	
	
	public static void main(String[] args) {

		Isci isci1 = new Isci();

		isci1.meslek = "kaynakçı";
		isci1.saatUcreti = 20;
		isci1.isim = "emine";
		isci1.maas = isci1.maasHesapla();

		System.out.println(isci1.isim + "in maaşı :" + isci1.maas);

	
	
	
	}

}

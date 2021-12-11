package day35_encapsulation_ininheritance;

public class Muhasebe extends personel{

	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("muhasebe parametresiz consrt. çalıştı");
	}
	
	
	public static void main(String[] args) {
		
		
		Muhasebe clsn1=new Muhasebe();
		
		clsn1.isim="ali";
		
		System.out.println(clsn1.soyİsim);//null
	
	

	}

	public int maasHesapla() {
		
		int maas=8*25*saatUcreti;
		
		return maas;
		
	}
	
	
	
}

package day26_forEachloop_constructor;

public class jeepRunner {

	public static void main(String[] args) {
		
		
		//jeep class ından bir obje oluşturalım ve özelliklerini yazdıralım
		
		
		jeep jeep1=new jeep();
		
		
		System.out.println(jeep1.fiyat +" "+ jeep1.ilanNo+" "
				+" "+jeep1.marka+" "+ jeep1.model+ " "+ jeep1.yil);
		
		
		//10000 1001  null null 2001
		
		
		System.out.println("*****yeni değer****");
		
		//jeep class ındaki variable ler instance variable lar olduklarından
		//atatığım değerler sadece benim objem için değerleri değiştirir
		//jeep clasındaki değerleri değiştirmez
		
		
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="toyoya";
		jeep1.model="corolla";
		jeep1.yil=2005;
		
		System.out.println(jeep1.fiyat +" "+ jeep1.ilanNo+" "
				+" "+jeep1.marka+" "+ jeep1.model+ " "+ jeep1.yil);
		
		
		
		System.out.println("*****************");
		
		
		
		jeep1.hiz(150);//araba saate 150 km yapar
		jeep1.yakit("benzin");//araba yakıt olarak benzin kullanır
		
		
		
		
		
		
		
		
		
		
		
	}

}

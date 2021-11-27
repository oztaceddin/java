package day27_constructer_constructerCall;

public class TirRunner {

	public static void main(String[] args) {
		// bit tane tüm özellikleri değiştiren constructer oluşturalım
		
		
		Tir tir1=new Tir(5000,"axor","beyaz",2020,false);
		              //int km,string model,string renk,int yıl,boolean satılıkmı
	System.out.println(tir1.km +" " + tir1.model + " " + tir1.renk + " " + tir1.yil+" " + tir1.satilikMi);
	
	
	
	
	//3 özelliği değiştiren constructer oluşturalım
	//int km,string model,string renk
	
	Tir tir2=new Tir(12000,"kar","kırmızı");
	System.out.println(tir2.km +" " + tir2.model + " " + tir2.renk + " " + tir2.yil+" " + tir2.satilikMi);
	
	}

}

package day26_forEachloop_constructor;

public class Car {

	//java biz bir class oluşt.o classta obje üretecegimizi bilir
	//ve her class'a default bir constructor yerleştirir
	//javanın class'a koydugu bu default constructor görülmez
	//ama obje üretmek üzere kod yazdığımızda otamatik olarak devreye girer
	
	
	//bir constructor oluşturmak çok kolaydır
	//method a benzer ama methoddan farklıdır
	//1constructor isimleri class ismi ile aynı olmalıdır
	//class isimleri büyükharfle başladığı için constructor ismide büyük harfle başlar
	
	//method dan 1farkı budur methodlar küçük harfle başlar
	
	
	//2-constructor  return type olmaz
	
	//method dan 2.farkı budur methodların mutlaka return type olmalıdır
	
	public Car() {
		
	}
	
	//javanın her class da oluşturduğu constructor budur
	
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikmi;
	
	
	//bugün itibari ile classlardan main method olma mecburiyeti kaldırılmıştır
	
	//ancak bildiğimiz gibi main method olmayan bir class direk çalıştırılamaz
	
	//main method u olmayan classlar başka classlardan obje oluşturarark kullanılmak üzere
	//ihtiyaç duyulan variable ve method lari sakladığımız bir depo gibi

}

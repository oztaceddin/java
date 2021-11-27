package day27_constructer_constructerCall;

public class Car1 {
	int yil = 2000;

	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagımız tüz özellikleri parametre olarak yolladık

	}

	// ben 5 ozelligi birden degistiren bir constructor urettigimde
	// java default costructor'i siler
	// bu durumda daha onceden yazilan ve default constructoru kullanan tum kodlar
	// coker
	// bu durumda kodlari düzeltmek icin javanin sildigi default constructor yerine
	// parametresiz bir constructor olusturmaliyim

	
	
	public Car1(int i) {// bu satırdaki km ile class level deki int km
		km=i; // farklı scope lardadır
	}

	public Car1() {
		// TODO Auto-generated constructor stub
	}

	public Car1(int i, int j) {
		yil=i;
		km=j;
	}

	public void hiz(int hiz) {
		System.out.println("araba saatte " + hiz + " km yapar");
	}

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");

	}
}
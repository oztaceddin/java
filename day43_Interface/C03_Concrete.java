package day43_Interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {

		C03_Concrete concrteobje = new C03_Concrete();

		// interfacede default keyword kullanarak oluşturduğumuz body si olan methodlara
		// child concrete class lardan obje vasıtasıyla ulaşabiliriz
		concrteobje.kaporta();

		// interfacede default keyword kullanarak oluşturduğumuz body si olan methodlara
		// child concrete class lardan interface ismi vasıtasıyla ulaşabiliriz

		C02_Interface.sanzuman();

	}

	// bir interface de static veya default keyword kullanarak body si olan bir
	// method
	// oluşturursak bu interface e implements eden concrte class lar bu method ları
	// implement etmek ZORUNDA DEĞİLDİR

	@Override
	public void motor() {
	

	}

}

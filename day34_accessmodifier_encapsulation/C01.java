package day34_accessmodifier_encapsulation;

public class C01 {

	private int sayiPrivate = 10;
	
	//PRİVATE CLASS ÜYELERİNE SADECE İÇİNDE BULUNDUĞU CLASSDAN ULAŞA BİLİRİZ
		
	
	int sayiDefault = 20;
	
	//DEFAULT CLASS ÜYELERİNE SADECE İÇİNDE BLUNDUĞU PACKAGE DEN ULAŞILA BİLİNİR
	//DEFAULT ACCESS MODİFİER İN DİĞER İSMİDE PACKAGE ACCESS MİDİFİER DİR
	
	protected int sayiProtected = 30;
	
	//PROTECTED CLASS ÜYELERİNE İÇİNDE BULUNDUĞU PACKAGE DEKİ TÜM CLASS DAKİ VE
	//BAŞKA PACKAGE DEKİ CHİD CLASSLAR ULAŞABİLİR
	
	
	public int sayiPublic = 40;

	//PUBLİC CLASS ÜYELERİNE TÜM PACKAGE LERDEN TÜM CLASSLARDAN ULAŞILABİLİNİR
	
	
	// private<default<protected<public

	public static void main(String[] args) {
		C01 obj = new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

	public void staticOlmayanMethod() {

		C01 obj = new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

}

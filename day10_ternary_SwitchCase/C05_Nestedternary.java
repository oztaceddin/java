package day10_ternary_SwitchCase;

public class C05_Nestedternary {

	public static void main(String[] args) {
		//Kullaniciya yasini sorun,
		// eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
		//65’e esit veya buyukse “Emekli olabilirsin” yazdirin
           //test datalarýmýzý variable olarak da oluþturabiliriz
		//ve kod un yazýmý bittiðinde bu test datalarý deðiþtirerek
		//kodlarýmýzý test edebiliriz


	char cinsiyet='K';
	int yas=68;
	
	
	 String sonuc=  cinsiyet=='K' ? (yas>=60 ? "emekli olabilirsin " :"emekli olamassýn"):
		                            (yas>=65 ? "emekli olabilir" : "emekli olamassýn");
	
	System.out.println(sonuc);
	
	
	
	
	
	
	}

}

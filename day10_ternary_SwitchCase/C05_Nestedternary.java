package day10_ternary_SwitchCase;

public class C05_Nestedternary {

	public static void main(String[] args) {
		//Kullaniciya yasini sorun,
		// eger yas 65�den kucuk ise �emekli olamazsin, calismalisin�,
		//65�e esit veya buyukse �Emekli olabilirsin� yazdirin
           //test datalar�m�z� variable olarak da olu�turabiliriz
		//ve kod un yaz�m� bitti�inde bu test datalar� de�i�tirerek
		//kodlar�m�z� test edebiliriz


	char cinsiyet='K';
	int yas=68;
	
	
	 String sonuc=  cinsiyet=='K' ? (yas>=60 ? "emekli olabilirsin " :"emekli olamass�n"):
		                            (yas>=65 ? "emekli olabilir" : "emekli olamass�n");
	
	System.out.println(sonuc);
	
	
	
	
	
	
	}

}

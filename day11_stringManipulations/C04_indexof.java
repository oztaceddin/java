package day11_stringManipulations;

public class C04_indexof {

	public static void main(String[] args) {
		// girilen parametreleri bir cahar yada Stringin ilk index ini veriri
		
		String str="çalışırsanız ,java çok kolay";
		
		System.out.println(str.indexOf('ş'));//4	
        System.out.println(str.indexOf("j"));//14
		
		
		int index=str.indexOf("r");
		
		//indexof metodu bize herzaman int de�er d�ner
	
	System.out.println(index);//6
	
	
	System.out.println(str.indexOf("r"));//-1
	
	//e�er bir stringin(i�inde olmayan bir karakter ararsak)
	//index de�eri olarak -1 gelirse 
	//o stringin olmad���n� anlar�z
	
	
	System.out.println(str.indexOf("va ç"));
	 // bu durumda java aradigimiz CS'i tek bir paket gibi dusunur ve 
	//o paketin baslangic
	//index'ini bize verir
	
	System.out.println(str.indexOf('a',11));
	
	
	
	}

}

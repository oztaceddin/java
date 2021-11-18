package day10_ternary_SwitchCase;

public class C11_smConcat {

	public static void main(String[] args) {
		//string olarak verilen bir deðiþken + ile baþka bir deðiþken iþleme
		//sokulursa java bunlarý yanyana ekler.Buna concatenation denir
		
		
		String isim="ali";
		
		String soyisim="can";
		
		System.out.println(isim +" "+ soyisim);
		
		//yada + iþareti olmadanda concat() ile yapabiliriz

	System.out.println(isim.concat(soyisim));//boþluksuz
	
	System.out.println(isim.concat(" ").concat(soyisim));
	
	
	
	
	}

}

package day10_ternary_SwitchCase;

public class C11_smConcat {

	public static void main(String[] args) {
		//string olarak verilen bir de�i�ken + ile ba�ka bir de�i�ken i�leme
		//sokulursa java bunlar� yanyana ekler.Buna concatenation denir
		
		
		String isim="ali";
		
		String soyisim="can";
		
		System.out.println(isim +" "+ soyisim);
		
		//yada + i�areti olmadanda concat() ile yapabiliriz

	System.out.println(isim.concat(soyisim));//bo�luksuz
	
	System.out.println(isim.concat(" ").concat(soyisim));
	
	
	
	
	}

}

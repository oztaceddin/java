package day10_ternary_SwitchCase;

public class C12_smcharat {

	public static void main(String[] args) {
		//charat(istenenindex)methodu istediðimiz indexteki karakteri verir

	
	String kurs="taceddin";
	System.out.println(kurs.charAt(7));//char harf istemi soldan baþlayarak gelir oda 0 dan baþlar
	
	System.out.println(kurs.toUpperCase().charAt(4));//seçilen harfi büyük yazarak verir
	
	
	System.out.println("" +kurs.toUpperCase().charAt(0)+
			kurs.toLowerCase().charAt(1)+kurs.toLowerCase().charAt(6));
	
	//ikitane charý toplatýrsak ascii degerleriyle sonuç çýkar
	//iþlemin baþýna hiçlik yani "" yaparsak doðru sonuca ulaþýrýz
	
	
	}

}

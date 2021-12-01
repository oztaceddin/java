package day30_ImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		
		//javada string iki türlü oluşturula bilir
		//1-non-primitive olduğu için new keyword ile
		//java önce eşitliğin sağına baktığından
		//new kelimesi olduğu için önce obje oluşturu
		//sonra değeri artar
		//yani bu oluşturma şekli herzaman
		//yeni bir obje oluşturur
		
		
		//2-bugüne kadar öğrendiğimiz gibi oluşturursak
		//String str2 = "mustafa";
		//java bu durumda eşitliğin sağında olan
		//string in STRİNG HAVUZU NDA olup olmadığına
		//kontrol eder ve havuzda varsa
		//yeni obje oluşturmaz,öncekinin referansına
		//yenisinin referansını da ekler
		
		
		
		
		String str1 = "mustafa";

		String str2 = "mustafa";

		String str3 = new String("mustafa");

		String str4 = new String("mustafa");

		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//true
		
		System.out.println(str4==str3);//false
		System.out.println(str4.equals(str3));//true
		
		System.out.println(str1==str2);//true
		
		
	}

}

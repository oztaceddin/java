package day05_matematikselişlemler;

public class C02_Matematiksel {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		String str1="ali";
		String str2="can";
		
		System.out.println(sayi1+sayi2+str1);//30ali
		
		System.out.println(str1+sayi1+sayi2);//ali1020
		
		System.out.println(str2+(sayi1+sayi2));//ali30
		
		System.out.println(sayi1*sayi2+str1);//200ali
		
		System.out.println(str1+sayi1*sayi2);//ali200
		
		

	}

}

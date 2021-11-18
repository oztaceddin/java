package day12;

import java.util.Scanner;

public class C01_indexof {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin,
		//harfin cumlede var olup olmadigini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz  :");

	
	
	String cumle=scan.nextLine();
	System.out.println("lütfen varlýðýný kontrol etmek "
			+ "için bir harf giriniz  :");
	
	char krk=scan.nextLine().charAt(0);
	
	
	int index=cumle.indexOf(krk);
	//yada if in içine cumle.indexOf(krk) olur
	
	if (index<0) {
		System.out.println("girdiðiniz harf verilen cümlede yok");
	}else {
		System.out.println("girdiðiniz harf verilen cümlede var");
	}
	
	scan.close();
	
	}

}

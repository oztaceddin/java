package day12;

import java.util.Scanner;

public class C01_indexof {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin,
		//harfin cumlede var olup olmadigini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir c�mle giriniz  :");

	
	
	String cumle=scan.nextLine();
	System.out.println("l�tfen varl���n� kontrol etmek "
			+ "i�in bir harf giriniz  :");
	
	char krk=scan.nextLine().charAt(0);
	
	
	int index=cumle.indexOf(krk);
	//yada if in i�ine cumle.indexOf(krk) olur
	
	if (index<0) {
		System.out.println("girdi�iniz harf verilen c�mlede yok");
	}else {
		System.out.println("girdi�iniz harf verilen c�mlede var");
	}
	
	scan.close();
	
	}

}

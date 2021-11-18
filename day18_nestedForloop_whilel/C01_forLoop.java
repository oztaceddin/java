package day18_nestedForloop_whilel;

import java.util.Scanner;

public class C01_forLoop {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi isteyin
	   // ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
		// (ikinci sayi dahil olmak zorunda degil)

	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen üçer üçer saydırmak için 2 tane tam sayı sayı   giriniz...");

		int sayi1 = scan.nextInt();
		  int sayi2=scan.nextInt();
		  
		  if (sayi1>sayi2) {//sayi1 büyüksek azalır
			for (int i = sayi1; i>=sayi2; i-=3) {
				System.out.print(i+" ");
			}
		  
		  } else if(sayi1<sayi2){//sayi1 küçükse artarak
           
			  for (int i = sayi1; i <= sayi2; i+=3) {
				  System.out.print(i+" ");
             }
		
		  }else {
			System.out.println("girilen sayılar eşit");
		}
		  
	
	
	scan.close();
	
	
	}

}

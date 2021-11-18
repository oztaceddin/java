package day09_Nestedıfelse;

import java.util.Scanner;

public class Co04_ödev {

	public static void main(String[] args) {
		
		//Kullanicidan yil alin
		// 100e ve 400 e tam bolunuyorsa artik yildir 
		//100 e tam bolunuyor 400 e tam bolunmuyorsa artik yil degildir bu 3 satir evet durumu
		// 100 e tam bolunmuyorsa 4 e tam bolunuyorsa artik yildir hayir durumu 
		// 100 tam bolunmuyor 4 e tam bolunmuyorsa artik yil degildir
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen Yil Girin");
		int yil =scan.nextInt();
		
		// Nested If ile Cozumu
	if (yil%100==0) { // yil 100 tam bolunuyor
		if (yil%400==0) {
			System.out.println("Artik Yildir");
		} else {
			System.out.println("Artik Yil Degildir");
		}
		
	} else if(yil%100!=0) {// yil 100 e tam bolunmuyorsa otomatik kod burayi calistiracaktir
           
		if(yil%4==0) {
		System.out.println("Artik Yildir");
	}else{
		System.out.println("Artik Yil Degildir");
	}
	
	}	
				
		
	// Nested Ternary ile Cozumu
	System.out.println(	yil%100==0? 
			(yil%400==0 ? "Artik Yil":"Artik Yil Degildir"):(yil%100!=0&&yil%4==0?"Artik Yildir":"Artik Yil Degildir"));	
			scan.close();
	
	
	
	
	
	
	
	
	}

}

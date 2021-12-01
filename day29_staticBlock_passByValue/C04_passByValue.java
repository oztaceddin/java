package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_passByValue {

	public static void main(String[] args) {
		int sayılar[]= {3,4,5,6};
		
		elemanDegistir(sayılar);
		System.out.println("eleman değiştir methodunda sonra"+ Arrays.toString(sayılar));
	
	arriyiDegistir(sayılar);
	System.out.println("arrayi değiştir methodundan sonra"+ Arrays.toString(sayılar));//10,4,5,6
	
	
	}
	
	
	

	private static void arriyiDegistir(int[] sayılar) {
		sayılar=new int[6];
		System.out.println("arrayi değiştir methodunda"+ Arrays.toString(sayılar));//000000
	}




	private static void elemanDegistir(int[] sayılar) {
		sayılar[0]=10;
		
		System.out.println("eleman değiştir methodunda"+ Arrays.toString(sayılar));
		
	}

}

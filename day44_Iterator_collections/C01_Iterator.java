package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		
		
		List<Integer>liste=new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste);//[5, 3, 7, 1, 9, 8, 2]
		
		//index kullanmadan tüm elemanları 3 eklenmiş olarak yazdırın
		
		for (Integer each : liste) {
			System.out.print(each+3 +"  ");//8  6  10  4  12  11  5 
		}
		
		System.out.println("");
		System.out.println(liste);//[5, 3, 7, 1, 9, 8, 2]
		
		for (Integer each : liste) {
			each+=3;
			System.out.print(each+" ");//8 6 10 4 12 11 5 
		}
		
		
		
		//foreach loopla index kullanmadan tüm elemanlara ulaşabiliriz ama
		//kalıcı değişiklik yapamıyoruz
		
		
		
		
	}

}

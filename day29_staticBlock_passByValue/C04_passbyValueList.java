package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_passbyValueList {

	public static void main(String[] args) {
		// bir list oluşturalım
		// sonra list elemanlarını değiştir methodu yazıp
		// orada list elemanlarından bazılarını değiştir
		// method void olsun-main methoda döndükten sonra yeniden
		// list yazdıralım

		List<String> harfler = new ArrayList<>();

		harfler.add("A");
		harfler.add("B");
		harfler.add("C");

		listElemanlarDegistir(harfler);
		System.out.println("main method'a dönünce" + harfler);// dbc

		// javada list ve array gibi objeler içinde passbyvalue geçerlidir
		// yani farklı bir methodda array veya list de yeni değer ataması yaparsak
		// orjinal array veya list değişmez

		
		
		
		listdegistir(harfler);// method da yeni değer atatığım halde harfler listesi değişmedi
		System.out.println("liste yeni list atadıktan sonra main methoda dönünce" + harfler);// dbc

	}

	private static void listdegistir(List<String> harfler) {
		harfler = new ArrayList<>();

		System.out.println("liste yeni değer atayınca" + harfler);

	}

	private static void listElemanlarDegistir(List<String> harfler) {

		harfler.set(0, "D");

		System.out.println("method da değiştirdiğimiz" + harfler);

	}

}

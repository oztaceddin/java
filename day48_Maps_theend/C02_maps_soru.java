package day48_Maps_theend;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class C02_maps_soru {

	public static void main(String[] args) {
		// Verilen map’te istenen programlama dilini bilen kisileri list
		// olarak donduren bir method yaziniz.
		// mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil è java
		// Sonuc è [Ali, Veli]

		Map<Integer, String> soruMap = MapOlustur.myMap();

		String istenDil = "java";

		dilBilenListesi(soruMap, istenDil);
		System.out.println(dilBilenListesi(soruMap, istenDil));
	}

	private static List<String> dilBilenListesi(Map<Integer, String> soruMap, String istenDil) {

		List<String> dilBilenListesi = new ArrayList<>();
		// mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil è java

		// soruMap.values();//bize collection döndürür

		List<String> valuList = new ArrayList<>(soruMap.values());

		// System.out.println(valuList);eleman sayısı 3[ali,can,java, veli,yan,java,
		// ali,yan,qa]

		// bu üç elemanı tek tek ele alıp split ile bölüp
		// dil değeri verilen inputa eşit olanları
		// isim değirine dilbilenlistesine ekliyecegiz

		String parcalıArr[] = new String[3];

		for (String each : valuList) {

			parcalıArr = each.split(",");

			if (parcalıArr[2].equalsIgnoreCase(istenDil)) {
				dilBilenListesi.add(parcalıArr[0]);
				
			}

		}

		return dilBilenListesi;

	}

}

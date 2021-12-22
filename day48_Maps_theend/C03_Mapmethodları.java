package day48_Maps_theend;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_Mapmethodları {

	public static void main(String[] args) {

		Map<Integer, String> ornek = MapOlustur.myMap();

		System.out.println(ornek);

		System.out.println(ornek.containsKey(110));// false--içeriyormu diye aratır
		System.out.println(ornek.containsValue("java"));// false
		System.out.println(ornek.containsValue("ali,can,java"));// true

		System.out.println(ornek.entrySet());// [101=ali,can,java, 102=veli,yan,java, 103=ali,yan,qa,
												// 104=taceddin,yan,java, 105=deli,yan,c#, 106=kara,yan,java]
		
		
		Set<Entry<Integer, String>> entrySet=ornek.entrySet();//her bir elemanı entry
		
	    int sayac=1;
		
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry :"+each);
			sayac++;
			
		}
		System.out.println("");
		System.out.println(ornek.getOrDefault(110, "girilen key map te yok"));//girilen key map te yok--sol taraftaki key yoksa
		                                                                      //sağdaki mesajı bize döndürür
		System.out.println(ornek.getOrDefault(103, "girilen key map te yok"));//ali,yan,qa---soldaki key varsa--valueleri döndürür
	
	
	    ornek.putIfAbsent(103, "ali,yan,qa");//varsa ekleme yapmaz yoksa ekleme yapar
	    ornek.putIfAbsent(110, "fikri,yan,c#");//ekleyecek
	
	    System.out.println("**********liste kontrol********");
	    
	    
         sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry :"+each);
			sayac++;
			
		}//listenin sonuna 7.entry :110=fikri,yan,c# ekler
		
		
//	    String maptenString=ornek.toString();
//	    System.out.println(maptenString);///listemizi sitringe dönüştürp bize verirr
	
	
	
	
	
	
	
	
	
	}

}

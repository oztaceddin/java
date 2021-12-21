package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {

		// iç içe Map oluşturacaksak en içeridekinden başlamamız faydalı olur

		Map<String, String> ogr1Map = new HashMap<>();

		ogr1Map.put("isim", "ali");
		ogr1Map.put("soyisim", "can");
		ogr1Map.put("branş", "devel.");

		Map<String, String> ogr2Map = new HashMap<>();

		ogr2Map.put("isim", "ali");
		ogr2Map.put("soyisim", "yan");
		ogr2Map.put("branş", "qa");

		Map<String, String> ogr3Map = new HashMap<>();

		ogr3Map.put("isim", "veli");
		ogr3Map.put("soyisim", "yan");
		ogr3Map.put("branş", "qa");
		
		
		
		System.out.println("1. ogr:"+ogr1Map);//1. ogr:{branş=devel., soyisim=can, isim=ali}
		System.out.println("2. ogr: "+ogr2Map);//2. ogr: {branş=qa, soyisim=yan, isim=ali}
		System.out.println("3.ogr:"+ogr3Map);//3.ogr:{branş=qa, soyisim=yan, isim=veli}
		
		Map<Integer,Map<String, String>> sınıfMap=new HashMap<>();
		
		sınıfMap.put(101,ogr1Map);
		sınıfMap.put(102,ogr2Map);
		sınıfMap.put(103,ogr3Map);
		
		System.out.println(sınıfMap);//{101={branş=devel., soyisim=can, isim=ali},
		                              //102={branş=qa, soyisim=yan, isim=ali}, 
		                             // 103={branş=qa, soyisim=yan, isim=veli}}
		
		
		
		
		
		

	}

}

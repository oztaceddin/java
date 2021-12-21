package day47_Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("unused")
public class C01_Maps {

	public static void main(String[] args) {

		// bir map oluşturmadan önce,map e koyacagımız KEY ve VALUE değerlerini
		// incelemeliyiz
		// tüm değerleri koyabilmek için key ve value için object seçebiliriz
		//ama budurumda map içerisinde deki elemanlara ait bilgilere ulaşmakta zorlanabiliriz
		//data türünü seçerken hem içine koyacagımız tüm elemanları kapsayacak bir data türü seçmeliyiz
		//hemde içine koyduğumuz tüm elemanları işleyecek şekilde basit data türü seçmeli
		
		//**********
		
		//map i oluştururken map in türünede karar vermeliyiz
		
		
	/*	
		
		HashMap<Integer,String> liste=new HashMap<>();
       
        Scanner scan=new Scanner(System.in);
        
        System.out.println("kimlik noyu giriniz");
        
        Integer key=scan.nextInt();
        
        System.out.println("Adı   giriniz");
        
        String bilgi=scan.next();
        
         liste.put(key, bilgi );
       
        System.out.println(liste);
		
	*/
		
		Map<Integer,String> sınıf=new HashMap<>();
		
		sınıf.put(101,"ali,can,dev"	);
		sınıf.put(102,"veli,yan,qa");
		sınıf.put(103,"ali,yan,c#");
		
		
		
		System.out.println(sınıf);//{101=ali,can,dev, 102=veli,yan,qa, 103=ali,yan,c#}
		
		//no su 102 olan öğrencinn bilgilerini görelim
		System.out.println(sınıf.get(102));//veli,yan,qa
		
		//mapteki tüm key leri görelim
		
		System.out.println(sınıf.keySet());//[101, 102, 103]
		
		System.out.println(sınıf.values());//[ali,can,dev, veli,yan,qa, ali,yan,c#]

		//ancak yazdırma işlemi dışında birşey yapamayız
		
		
		//sınıftaki öğrencilerin isimlerini bir listeye ekleyip yazdıralm
		
		List<String> valueList=new ArrayList<>((sınıf.values()));
		
		System.out.println(valueList);//[ali,can,dev, veli,yan,qa, ali,yan,c#]
		
		System.out.println(valueList.size());//3
		
		//sadece isimleri getirelim
		
		
		List<String>isimListesi=new ArrayList<>();
		
		String bilgiler[]=new String [3];
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);//--1 yazarsak soyisim--2 yazarsak branşı gelir
			
			
		}
		
		System.out.println(isimListesi);//[ali, veli, ali]
		
		
		//2.yol
		
		/*List<String> isimListesi=new ArrayList<>();
        String[] bilgiler=new String[3];
        for(String str : valueList) {
            bilgiler=str.split(", ");
            isimListesi.add(bilgiler[0]);
        }
        System.out.println(isimListesi);
        */
		
		

	}

}

package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Foreachhlloop {

	public static void main(String[] args) {
		// bazen index ile uğraşmadan bir array veya listedeki tüm elemanları
		//gözden geçirmek isteriz
		
		
		int arr[]= {1,2,3,5,3,2,7};
		
		//bu array i esnek bir list yapmak istiyorum
		
		List<Integer> yeniList= new ArrayList<>();
		
		
		
		/*for (int i = 0; i < arr.length; i++) {
			
			yeniList.add(arr[i]);
		}
		
		System.out.println(yeniList);*/
		
		
		
		
		for (int each : arr) {//arr deki herbir (each) int i bana getir
			
		yeniList.add(each);
		
		
		}
		
		
		System.out.println(yeniList);
		
		
		
		
		
		//eğer bir list veya arrayin tüm elemanlarını elden geçirmek istiyorsak sıralama önemli değilse 
		//foreachloop kullanırız
		
		
		
		
		
		
		

	}

}

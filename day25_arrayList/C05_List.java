package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede içinde belirli bir harf olan elemanları
		//silen bir metod yazınız
		
		
List<String>str=new ArrayList<>();
str.add("tarla");	
str.add("kara");	
str.add("ceyhun");
str.add("yıldız");
str.add("lokum");
str.add("tc");

System.out.println(str);

String silinecekharf="a";
	
	str =killTheall(str,silinecekharf);
	
	
	
	
	
	
	
	
	}

	private static List<String> killTheall(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--;
			}
			
		}//for (int i = list.size()-1; i >=0 ; i--)
		
		System.out.println(str);
		
		
		return str;
		
		
	}

}

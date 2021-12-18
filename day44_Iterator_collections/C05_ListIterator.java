package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List<String> liste=new ArrayList<>();
		
		liste.add("ali");
		liste.add("veli");
		liste.add("ayse");
		liste.add("fatma");
		liste.add("emrah");
		
		
		System.out.println(liste);//[ali, veli, ayse, fatma, emrah]
		
		
		ListIterator list1=liste.listIterator();
		String temp="";
		while (list1.hasNext()) {
			
			
			temp=(String) list1.next();
			list1.set(temp+"x");
			
			
	
		//list1.set(list1.next()+"x");  //2.YOLLLL
		
			
		}
		
		
		System.out.println(liste);//[alix, velix, aysex, fatmax, emrahx]
		
		//list1.previous()        gerinönmemizi sağlar
	}

}

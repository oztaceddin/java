package day44_Iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator_liste_silme {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//iterator kullanarak tümlementleri sil
		
		List<Integer> liste = new ArrayList<>();

		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);

		System.out.println(liste);
		
		Iterator ite1=liste.iterator();
		
		while (ite1.hasNext()) {
			ite1.next();
			ite1.remove();
			
			
		}
		System.out.println(liste);//[]
		
	
		
		
		
		
		
		
		
		

	}

}

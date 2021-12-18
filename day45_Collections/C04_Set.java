package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {
		
		Set<Object>s1=new HashSet<>();//data type OBJECT yaptıgımızda herşeyi kabuledr
		
		s1.add(4);
		s1.add(7);
		s1.add(11);
		
		System.out.println(s1);//[4, 7, 11]--sıralı olmak zorunda değil
		
		s1.add("java candır");
		
		
		System.out.println(s1);//[4, 7, java candır, 11]
		
		
		List<Object>liste=new ArrayList<>();
		
		liste.add(5);
		liste.add("java ");
		
		liste.add(true);
		liste.add('a');
		liste.add(s1);
		
		System.out.println(liste);//[5, java , true, a, [4, 7, java candır, 11]]

		
		
		
		
		

	}

}

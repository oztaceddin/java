package day46_collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {
		
		Set<String> lhs1=new LinkedHashSet<>();
		
		lhs1.add("ali");
		lhs1.add("veli");
		lhs1.add("celil");
		lhs1.add("hasan");
		
		Set<String> lhs2=new LinkedHashSet<>();
		lhs2.add("ali");
		lhs2.add("veli");
		lhs2.add("taceddin");
		
		
	//	System.out.println(lhs1.retainAll(lhs2));//true
		
	//	System.out.println(lhs1);//[ali, veli]
	//	System.out.println(lhs2);//[ali, veli, taceddin]
		
		
		
		System.out.println(lhs2.retainAll(lhs1));//true
		
		System.out.println(lhs2);//[ali, veli]--ali ve veli dışındaki hepsini sil
		
		
        
		

	}

}

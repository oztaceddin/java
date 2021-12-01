package day30_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		// string Immutable bir class iken list mutabledir

		String str = "ALi";
		str.toUpperCase(); // str==>ALİ

		System.out.println(str);// ALi
		
		System.out.println(str.toUpperCase());//ALİ
		
		System.out.println(str);//ALi
		
		
		List<String>isimler=new ArrayList<>();
		
		System.out.println(isimler);//[]

		isimler.add("ALi");
		System.out.println(isimler);//[ali]
		
		
		isimler.set(0, "veli");
		System.out.println(isimler);//[veli]
		
		isimler.remove(0);
		System.out.println(isimler);//[]
		
		
		
		
		
	}

}

package day48_Maps_theend;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {

		Map<String, Integer> ornek = new HashMap<>();

		ornek.put("a", 2);
		ornek.put("b", 5);
		ornek.put("c", 1);
		ornek.put("z", 3);
		ornek.put("k", 10);

		System.out.println(ornek);// {a=2, b=5, c=1, z=3, k=10}

		ornek.compute("a", (key, value) -> 10);//istediğimiz keyin valuesine değiştire biliriz

		System.out.println(ornek);//{a=10, b=5, c=1, z=3, k=10}
		
		
		ornek.compute("a", (key, value) -> 2*value+5);
		System.out.println(ornek);//{a=25, b=5, c=1, z=3, k=10}
		
		
		ornek.computeIfAbsent("d", v->20);//ekleme yapar
		
		ornek.computeIfAbsent("c", v->11);//var olanı değiştirmez
		
		
		System.out.println(ornek);//{a=25, b=5, c=1, d=20, z=3, k=10}
		
		
		ornek.computeIfPresent("c", (key, value) -> 2*value+5);
		System.out.println(ornek);//{a=25, b=5, c=7, d=20, z=3, k=10}
		
	
		
		
	}

}

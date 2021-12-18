package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_Linkedlist {

	public static void main(String[] args) {
		
		
		List<Integer> lin = new LinkedList<>();

		

		lin.add(5);
		lin.add(7);

		System.out.println(lin);//[5, 7]
		
		lin.add(9);//data türünü list seçtiğimiz içinsadece list interfacendeki methodları kullana biliriz
                  //interface olmasına ragmen list methodlarını 
		          //linkedlist class ında override ettiğimizden
		         //list interface olmasına rağmen list method larını kullandık
		
		
		
       Queue<Integer> lin2 = new LinkedList<>();

		

		lin2.add(5);
		lin2.add(7);
		lin2.clear();//data türü queue seçildiğinden queue interfacenden gelen methodlar kullanıldı
        
		
		
		
		System.out.println(lin2);//[]
		
		
		
	Deque<Integer> lin3 = new LinkedList<>();

		

		lin3.add(5);
		lin3.add(7);
		lin3.addLast(20);//sona 20 ekler
	
		
		System.out.println(lin3.hashCode());//34833
		
		

		System.out.println(lin3);//[5, 7, 20]
		
		
		
		
	}

}

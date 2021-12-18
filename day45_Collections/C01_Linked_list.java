package day45_Collections;

import java.util.LinkedList;

public class C01_Linked_list {

	public static void main(String[] args) {

		LinkedList<Integer> lin = new LinkedList<>();

		System.out.println(lin);// []

		lin.add(5);
		lin.add(7);

		System.out.println(lin);// [5, 7]

		// linked list in iki tane interface parenti vardır
		//1--list
		//2--deque==>queue
		
		
		lin.add(0,10);//list interface den gelen özellikle basa eleman ekleme
		System.out.println(lin);//[10, 5, 7]
		
		
		lin.addFirst(3);//queue interface den gelen özellikle başa eleman ekleme
		System.out.println(lin);//[3, 10, 5, 7]
		
		
		lin.addLast(25);//queue interface den gelen özellikle sona eleman ekleme
		System.out.println(lin);//[3, 10, 5, 7, 25]
		
		LinkedList<Integer>lin2=new LinkedList<>();
		
		lin2.addAll(lin);//bütün eski listeyi ekler
		System.out.println(lin2);//[3, 10, 5, 7, 25]
		
		lin2.addAll(1, lin);
		System.out.println(lin2);//[3, 3, 10, 5, 7, 25, 10, 5, 7, 25]
		
		
		
		
		

	}

}

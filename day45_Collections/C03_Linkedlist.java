package day45_Collections;

import java.util.LinkedList;

public class C03_Linkedlist {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> lin = new LinkedList<>();

		System.out.println(lin);// []

		lin.add(5);
		lin.add(7);

		System.out.println(lin);//[5, 7]
		
		System.out.println(lin.hashCode());//1123
		
		
		
		System.out.println(lin.peek());//silmeden ilk elemanı getirir--5
		
		System.out.println(lin.peekFirst());//silmeden ilk elemanı getirir lis
		
	
		
		LinkedList<Integer> lin2 = new LinkedList<>();
		
		System.out.println(lin2.peekFirst());//liste boşken bize null getirir--null
		
		
		System.out.println(lin.element());//5
		
	//	System.out.println(lin2.element());//NoSuchElementException
		
		System.out.println(lin.poll());//5---ilk elemanı silip onu bize getiririr
		System.out.println(lin);//[7]----ilk eleman silindiğinden 7 yi getirdi
		
		System.out.println(lin.poll());//7---ilk elemanı silip onu bize getiririr
		System.out.println(lin);//[]
		
		System.out.println(lin.poll());//liste boş olduğundan bize null getirir
		
		
		System.out.println(lin.hashCode());//1  bu liste için bize hasf codenı getirir
		
		
		
		System.out.println(lin2.offer(15));//ekleyip true döndüürr
		
		System.out.println(lin2);//15
		
		lin2.push(20);//--listenin başına ekleme yapar
		
		System.out.println(lin2);//[20, 15]
		
		
		
		
		
		
		

	}

}

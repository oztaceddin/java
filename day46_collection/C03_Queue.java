package day46_collection;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		//gelen sona eklenir--silinen sondan silinen
		//fifo(first in firstout
		
		
		Queue<String>kuyruk=new LinkedList<>();// listeye sonradan eklemeye başlar
		
		kuyruk.add("lütfullah");
		kuyruk.add("mustafa");
		kuyruk.add("rıdvan");
		
		System.out.println(kuyruk);//[lütfullah, mustafa, rıdvan]
		
		kuyruk.remove();//---ilk gelen ilk çıkar
		
		System.out.println(kuyruk);//[mustafa, rıdvan]
		
		kuyruk.remove();
		System.out.println(kuyruk);//[rıdvan]
		
		kuyruk.add("rıdvan");
		System.out.println(kuyruk);//[rıdvan, rıdvan]
		
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		
		System.out.println(kuyruk);//[rıdvan, rıdvan, null, null, null]
		
		

		
		
		
		
		
		
		
		

	}

}

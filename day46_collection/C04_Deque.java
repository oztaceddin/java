package day46_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		
		Deque<String> ciftBas=new LinkedList<>();
		
		ciftBas.add("yıldı");
		ciftBas.add("ali");
		
		System.out.println(ciftBas);//[yıldı, ali]--add() queue den geldiğinden sona ekler
		
		ciftBas.addLast("emine");
		
		System.out.println(ciftBas);//[yıldı, ali, emine]---deque den gelen özellik
		
		ciftBas.addFirst("taceddin");
		System.out.println(ciftBas);//[taceddin, yıldı, ali, emine]--başa ekleme yapar
		
		System.out.println(ciftBas.pop());//taceddin--ilk elemnti siler bize onu yazdırır
		
		System.out.println(ciftBas);//[yıldı, ali, emine]
		
		ciftBas.push("seyfo");
		System.out.println(ciftBas);//[seyfo, yıldı, ali, emine]

		ciftBas.add(null);
		System.out.println(ciftBas);//[seyfo, yıldı, ali, emine, null]

	}

}

package day26_forEachloop_constructor;

public class C01_Foreachloop {

	public static void main(String[] args) {
		/*
		 * iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each
		 * loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana
		 * “Ortak eleman yok” yazdiriniz white_check_mark eyes raised_hands
		 */

	
	String arr1[]= {"A","B","C"};
	
	String arr2[]= {"Av","R","O"};
	
	int flag=0;
	
	for (String each1 : arr1) {
		
		for (String each2 : arr2) {
			if (each1.equals(each2)) {
				System.out.println(each1 +" ");
				
				flag++;
				
			}
			
		}
		
		
	}
	
	if (flag==0) {
		System.out.println("ortak eleman yok");
	}
	
	
	
	
	
	
	
	}

}

package day13_StringManipulations;

public class C07_Homework {

	public static void main(String[] args) {
		// Soru 1) String methodlarini kullanarak �  Java ogrenmek123 Cok guzel@  �  
				// String�ini �Java ogrenmek cok guzel.� sekline getirin.


				String cumle="  Java ogrenmek123 Cok guzel@  ";
				cumle=cumle.trim();
				cumle=cumle.replaceAll("\\s", "x");
				cumle=cumle.replaceAll("\\W", "");
				cumle=cumle.replaceAll("\\d", "");
				cumle=cumle.replace("x", " ");
				System.out.println(cumle);

	}

}

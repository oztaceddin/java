package day33_sbuilder;

public class C04_insert {

	public static void main(String[] args) {
		
		
		
		
		StringBuilder sb= new StringBuilder("java öğrendik");
		
		//araya çok iyi ekleyelim
		
		sb.insert(4, "yı cok iyi");
		
		System.out.println(sb);//java çok iyi öğrendik
		
		String str2="çok iyiyim";
		
		sb.insert(7, str2, 0, 4);//str2 deki ilk  karekteri al 7. ciye ekler
		
		System.out.println(sb);
	
	
	
	

	
	}


}

package day13_StringManipulations;

public class C05_replaceAll {

	public static void main(String[] args) {
		
		
		String cumle="java    cok     zevkli";
		
		
		cumle=cumle.replaceAll("\s+"," ");//birden fazla olan bo�luklar� tek bo�lukla yerde�i�tirme
		System.out.println(cumle);
		
		cumle=cumle.replaceAll("[k-v]", " ");//ja a c   ze   i
		
        System.out.println(cumle);
	
	
	
	
	
	}

}

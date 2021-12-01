package day29_staticBlock_passByValue;

public class C01_StaticBlocks {

	static {
		System.out.println("static block nezaman çalışacak");
		//main metotdan önce çalışır
	}

	public static void main(String[] args) {
		System.out.println("java önce main method çalışır");

	}

	//birden fazla static block varsa enyukardaki önce çalışır
	
	
	
	
	
	
	
	
	
	
}

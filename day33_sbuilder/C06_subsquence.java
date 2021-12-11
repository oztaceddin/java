package day33_sbuilder;

public class C06_subsquence {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java ne kadar kolay");

		System.out.println(sb.substring(14));// kolay

		System.out.println(sb.subSequence(14, 19));// kolay
		
		System.out.println(sb);///subsquence atama yapmazz

		// ikiside aynı sonucudöndürür
		// ancak substring methodu string classndan geldiği için substring()
		// kullandığımızda
		// arkasından string methodlarını kullana bilirz

		// ancak subsquence kullandığımızda nu mümkün olmaz


	
	
	
	}

}

package day33_sbuilder;

public class C02_delete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java candır can");

		sb.deleteCharAt(11);// sadece 11. indexdeki karakteri siler

		System.out.println(sb);// java candırcan

		System.out.println(sb.delete(11, 14));// java candır

		System.out.println(sb.delete(9, sb.length()));// java cand

		System.out.println(sb.capacity());// 31

		System.out.println(sb.delete(5, 40));// java
		
		
		

	}

}

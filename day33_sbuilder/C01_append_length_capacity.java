package day33_sbuilder;

public class C01_append_length_capacity {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.length();// string builder in uzunluğunu verir

		System.out.println(sb.length());// 0 sb in kullanılan kısmının uzunluğunu verir

		System.out.println(sb.capacity());// 16--sb in kapasştesini verir

		StringBuilder sb2 = new StringBuilder("java candır");

		System.out.println(sb2.length()); // 11
		System.out.println(sb2.capacity());// 27

		StringBuilder sb3 = new StringBuilder(7);
		sb3.append("mehlika");
		System.out.println(sb3.length()); // 7
		System.out.println(sb3.capacity());// 7

		StringBuilder sb4 = new StringBuilder(7);
		sb4.append("nilgün");
		System.out.println(sb4.length()); // 6
		System.out.println(sb4.capacity());// 7

		sb.append("java");
		System.out.println(sb);// java

		sb.append(" candır");
		System.out.println(sb);

		sb.append("anlaşıldımı", 3, 4);// 3.karakterden başla 4 üncüye yazdır

		System.out.println(sb);// java candıra

		sb.append("anlaşıldımı", 3, 6);// 3 den başla 6 ya kadar

		System.out.println(sb);// java candıraaşı

	}

}

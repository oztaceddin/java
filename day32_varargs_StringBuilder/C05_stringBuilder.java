package day32_varargs_StringBuilder;

public class C05_stringBuilder {

	public static void main(String[] args) {
		
		
		String str="ali can";
		
		String str2=new String("veli cem");
		

	
	StringBuilder sb=new StringBuilder("yaşasın java");

	sb.append("!!!");
	System.out.println(sb);//yaşasın java!!!
	
	
	 String sbBuyuk=sb.toString().toUpperCase();
	
	System.out.println(sb);
	
	
	
	}

}

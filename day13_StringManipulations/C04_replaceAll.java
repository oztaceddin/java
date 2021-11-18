package day13_StringManipulations;

public class C04_replaceAll {

	public static void main(String[] args) {
		
		        //s==> bosluk /Space
		        //S==> bosluk disi hersey
		        //w==> tum harfler ve rakamlar
		        //W==> harfler ve rakamlar disi hersey 
		        //d==> Rakamlar
		        //D==>Rakamlar disi hersey 
		
		
		
		
		
		String str="*java 98ogrenmek c..ok k876olay";
		
		//replaceall methodlarý kullanarak java öðrenmek çok kolay 
		
		str=str.replaceAll("\\d", "");
		
		System.out.println(str);//*java öðrenmek c..ok kolay
		
	    str=str.replaceAll("\\s", "x");//javaxogrenmekxcokxkolay
		System.out.println(str);
		
		
		
		str=str.replaceAll("\\W", "");
		System.out.println(str);//javarenmekcokkolay

	    str=str.replace("x"," ");//java ogrenmek cok kolay
	    System.out.println(str);

	
	
	
	
	
	
	}

}

package day34_accessDeneme;

import day34_accessmodifier_encapsulation.C01;

public class C02_BaşkapackageChildClass extends C01{

	public static void main(String[] args) {
		C01 obj=new C01();
		
		
		//System.out.println(obj.sayiPrivate);
		
		//System.out.println(obj.sayiDefault);//main methoddan ulaşamamamızın sebebebi static klubü ile ilgili
		
		//System.out.println(obj.sayiProtected);
		
		System.out.println(obj.sayiPublic);

	
	
	
	
	}

	public void staticOlmayanMethod() {
		
	
		C01 obj=new C01();
		
		//System.out.println(obj.sayiDefault);
		
		
		System.out.println(sayiProtected);//bu classta sayiprotected diye vir variable olmadığı
		                                  //halde parent classda var olduğundan java problem yapmadı
		
		
		System.out.println(obj.sayiPublic);
		
	
	
	
	}
	
	
	
}

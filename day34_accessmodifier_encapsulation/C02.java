package day34_accessmodifier_encapsulation;

public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);//private variable'lara kendi class'i disindan ulasilama
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

	
	public void staticOlmayanMethod() {
		
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
		
		
	}
	

}

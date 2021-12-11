package day34_accessmodifier_encapsulation;

public class C04_PublicVeriPaylaşımı {

	public static void main(String[] args) {

		C03 obj = new C03();

		System.out.println(obj.isim);// ALİ CAN
		System.out.println(obj.maas);// 10000
		
		
		obj.isim="veli cem";
		
		obj.maas=15000;
		
		System.out.println(obj.isim);// velicem
		System.out.println(obj.maas);//15000
		

	}

}

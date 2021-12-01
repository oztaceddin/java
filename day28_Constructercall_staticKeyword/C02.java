package day28_Constructercall_staticKeyword;

public class C02 {

	int x = 5;
	static int y = 10;

	public static void main(String[] args) {
//3 tane obje oluşturup değişimleri gözlemleyelim
		
		C02 obje1=new C02();

	System.out.println("obje1 için x: "+obje1.x+" obje1 için y: "+ C02.y);
	
	obje1.x++;
	C02.y++;
	
	System.out.println("işlmdn obje1 için x: "+obje1.x+" işlemd obje1 için y: "+ C02.y);
	//aynı class içinde iken static variable lere ulaşmak için objeye ihtiyaç yoktur
	//kullanırsak java cte vermez 
	
	C02 obje2=new C02();

	System.out.println("obje2 için x: "+obje2.x+" obje2 için y: "+ C02.y);
	
	
	obje2.x++;
	C02.y++;
	
	System.out.println("işlm obje2 için x: "+obje2.x+" işlm obje2 için y: "+ C02.y);
	
	
	System.out.println("obje2 oluş. ve işlemden sonra obje 1"
	+" x : "+obje1.x+ " y: "+ C02.y);
	
	
	C02 obje3=new C02();
	
	obje3.x=20;
	C02.y =40;
	
	System.out.println("obje 3 ten sonra obje 1 in x :"+ obje1.x);//6
	System.out.println("obje 3 ten sonra obje 2 in x :"+ obje2.x);//6
	System.out.println("obje 3 ten sonra obje 3 in x :"+ obje3.x);//20
	

	System.out.println("obje 3 ten sonra obje 1 in y :"+ C02.y);//40
	System.out.println("obje 3 ten sonra obje 2 in y :"+ C02.y);//40
	System.out.println("obje 3 ten sonra obje 3 in y :"+ C02.y);//40
	
	
	}

}

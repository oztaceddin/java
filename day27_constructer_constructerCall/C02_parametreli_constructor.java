package day27_constructer_constructerCall;

public class C02_parametreli_constructor {

	public static void main(String[] args) {
		// java nın oluşturduğu defaultconstructor ile obje oluşturabiliriz
		// ama her obje için değer ataması uzun sürüyor istersek parametreli constructor
		// lar
		// oluşturup obje oluştururken istediğimiz özlkleri atayabiliriz

		Car1 car1 = new Car1(50000, "vectra", "beyaz", 2015, true);
		// int km, String model,String renk,int yil,boolean satılıkMi

		Car1 car2 = new Car1(35000);
		// int km

		System.out.println(car2.km);// 35000
		
		Car1 car3=new Car1();
		System.out.println(car3.km);//0
        
		Car1 car4=new Car1(1000);
		System.out.println(car4.km);//1000
		
		//yıl ve km yi parametre olarak girebilecegimiz bir constructor bdaha oluşturalım
		
		
		Car1 car5=new Car1(2020,5000);
		
		   System.out.println(car5.yil + " " + car5.km + " " + car5.model);
	        //                   2020             5000            null 
	
	
	
	
	
	
	
	
	
	}

}

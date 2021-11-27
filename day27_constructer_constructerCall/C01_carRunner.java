package day27_constructer_constructerCall;

import day26_forEachloop_constructor.Car;

public class C01_carRunner {

	public static void main(String[] args) {
		// Dunku Car clss'indan bir obje olusturmak istedigimizde
        // java Car class'ini icinde bulundugumuz class'a import etmek ister
        
        Car car=new Car();
        System.out.println(car.yil); 
        // ancak baska package'da oldugu icin icinde oldugumuz class'dan 
        // Car class'indaki variable'lara ulasabilmem icin variable'in axcess modifier'i
        // public olmalidir
        
        
        Car1 car1 =new Car1();
        System.out.println(car1.km +" " + car1.model + " " + car1.renk + " " + car1.yil+" " + car1.satilikMi);
        // 0 null null 2000 false
        
        car1.km=75000;
        car1.model="Corolla";
        car1.renk="Kirmizi";
        System.out.println(car1.km +" " + car1.model + " " + car1.renk + " " + car1.yil+" " + car1.satilikMi);
        // 75000 Corolla Kirmizi 2000 false
        
	
	Car1 car2=new Car1();//oluşturduğumuz obje
	System.out.println(car2.km +" " + car2.model + " " + car2.renk + " " + car2.yil+" " + car2.satilikMi);
	//0null null 2000 false
	//car 2 için yeniden  veriable atamamız gerekli yoksa ilk oluşturduğumuz bilgilerden alır
	
	
	Car1 car3=new Car1();//obje oluşumu
	car3.km=40000;
	car3.satilikMi=true;
	System.out.println(car3.km +" " + car3.model + " " + car3.renk + " " + car3.yil+" " + car3.satilikMi);
    //40000-null-null-2000-true
	
	
	
	}

}

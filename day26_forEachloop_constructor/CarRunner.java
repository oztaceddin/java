package day26_forEachloop_constructor;

public class CarRunner {

	public static void main(String[] args) {
		//car classından bir obje oluşturalım
		
		     Car          car1         =        new       Car();
		//class ismi    obje ismi     atama   keyword    constructor call
		
		
		
		
       System.out.println(car1.km +" "+ car1.model +" "
                        + car1.renk+" "+ car1.yil);//0 null null 2000
		
     // bir obje oluştururken eğer obje için kendi class ında belirlenen değerleri
     //kullanmak istiyorsak hiç bir değeri kendim atamadan obje oluşturabiliriz
       
     //bu durumda hiç bir parametre kullanılmadığı için default constructor yeterli olacaktır
		
	 //eğer obje oluşturduğumuz classtaki değerleri kullanmak yerine kendi değerlerimiz ile obje oluşturursak
     //ozaman parametreli constructor oluşturmamız gerekli
       
       
     //  car car2=new Car("kırmızı olsun","corolla");
		
	//car classında 2 string parametresi olan bir constructor olmadığı için bu obje oluşturmayı
    //şimdilik yapamayız   

	}

}

package day10_ternary_SwitchCase;

public class C12_smcharat {

	public static void main(String[] args) {
		//charat(istenenindex)methodu istedi�imiz indexteki karakteri verir

	
	String kurs="taceddin";
	System.out.println(kurs.charAt(7));//char harf istemi soldan ba�layarak gelir oda 0 dan ba�lar
	
	System.out.println(kurs.toUpperCase().charAt(4));//se�ilen harfi b�y�k yazarak verir
	
	
	System.out.println("" +kurs.toUpperCase().charAt(0)+
			kurs.toLowerCase().charAt(1)+kurs.toLowerCase().charAt(6));
	
	//ikitane char� toplat�rsak ascii degerleriyle sonu� ��kar
	//i�lemin ba��na hi�lik yani "" yaparsak do�ru sonuca ula��r�z
	
	
	}

}

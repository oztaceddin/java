package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {

		// verilen arrayde tekrar eden elementleri sadece birertane yazarak
		// unique elementlerden oluşan bir array haline getirelim

		int arr[] = { 2, 3, 4, 5, 3, 6, 2, 5, 3, 7, 4, 8, 5, 9, 1, 0, 3, 5 };

		// 2,3,4,5,6,7,8,9,1,0

		List<Integer> tekrarsız = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsız.contains(arr[i]))
				;
			{
				tekrarsız.add(arr[i]);

			}

		}
		System.out.println(tekrarsız);
		int tekrarsızArray[] = new int[tekrarsız.size()];
		for (int i = 0; i < tekrarsızArray.length; i++) {

		}

	System.out.println();
	
	
	
	
	
	
	
	
	}

}

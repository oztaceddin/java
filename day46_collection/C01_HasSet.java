package day46_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HasSet {

	public static void main(String[] args) {
		
		//verilen bir arraydeki tekrarn eden sayıları 
		//uniq değerlerden oluşan bir array oluşturun
		
		int arr[]= {2,3,4,5,6,9,8,7,2,5,3,4};
		
		Set<Integer>benzersizSet=new HashSet<>();
		
		for (Integer each :arr) {
			
			benzersizSet.add(each);
			
		}
		System.out.println(benzersizSet);//[2, 3, 4, 5, 6, 7, 8, 9]

		Object[] tekrarsızArr=benzersizSet.toArray();
		
		System.out.println(Arrays.toString(tekrarsızArr));//[2, 3, 4, 5, 6, 7, 8, 9]
		
		//tekareden sayıları çıkartıp tekil olarak aldık
		
		
		int tekrarsiz[]= new int[benzersizSet.size()];
	    int index=0;
	    for (int each : benzersizSet) {
	        tekrarsiz[index]=each;
	        index++;
	    }System.out.println(Arrays.toString(tekrarsiz));

	}

}

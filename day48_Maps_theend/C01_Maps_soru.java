package day48_Maps_theend;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C01_Maps_soru {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return
		// eden bir method yaziniz
		// Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen  bir kelime giriniz");

		String input = scan.nextLine();

		Map<String, Integer> mainMap = harfSay(input);

		System.out.println(mainMap);
		
		scan.close();

	}

	private static Map<String, Integer> harfSay(String input) {

		Map<String, Integer> harfSayilariMap = new HashMap<>();
		String inputarr[] = input.split("");// [h, e, l, o, o]

		for (String each : inputarr) {
			if (!harfSayilariMap.containsKey(each)) {
				harfSayilariMap.put(each, 1);

			} else {
				// harfSayilariMap.get(each)+1--bu girilen harfin value sunu buılup 1 artırır

				harfSayilariMap.put(each, harfSayilariMap.get(each) + 1);

			}

		}

		return harfSayilariMap;
	}

}

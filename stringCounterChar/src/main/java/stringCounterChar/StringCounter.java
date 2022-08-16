package stringCounterChar;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class StringCounter {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		String string = "0";
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		while (!string.equals("-1")) {
			System.out.println("Welcome! Please insert the string for the counter (-1 to quit): ");
			string = obj.nextLine();

			if (!string.equals("-1")) {
				for (int i = 0; i < string.length(); i++) {
					if (!hash.containsKey(String.valueOf(string.charAt(i))) && !Character.isDigit(string.charAt(i))
							&& !StringUtils.isBlank(String.valueOf(string.charAt(i)))) {
						hash.put(String.valueOf(string.charAt(i)), 1);
					} else {
						for (Entry<String, Integer> entry : hash.entrySet()) {

							if (entry.getKey().equals(String.valueOf(string.charAt(i)))) {
								hash.put(String.valueOf(string.charAt(i)), entry.getValue() + 1);
							}
						}

					}
				}
				System.out.println("\nCharacter counter: \n" + hash);
				hash.clear();
			}
		}
	}
}

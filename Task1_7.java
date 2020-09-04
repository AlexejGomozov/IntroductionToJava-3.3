package stringOrStringBuilder;

import java.util.Scanner;

/*
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */

public class Task1_7 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        System.out.println(getResult(text));
  sc.close();
	    }

	    private static String getResult(String text) {
	        StringBuilder stringBuilder = new StringBuilder(text);
	        for (int i = 0; i < stringBuilder.length(); i++) {
	            char character = stringBuilder.charAt(i);
	            if (character == ' ') {
	                stringBuilder.deleteCharAt(i);
	                i--;
	                continue;
	            }
	            for (int j = i + 1; j < stringBuilder.length(); j++) {
	                if (stringBuilder.charAt(j) == character) {
	                    stringBuilder.deleteCharAt(j);
	                }
	            }
	        }
	        return stringBuilder.toString();
	    }
}
//abc cde def
//abcdef
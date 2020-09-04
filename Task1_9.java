package stringOrStringBuilder;

import java.util.Scanner;

/*
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 */

public class Task1_9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        findLetters(text);
        sc.close();
    }

    private static void findLetters(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int countOfSmall = 0;
        int countOfBig = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a' && stringBuilder.charAt(i) <= 'z') {
                countOfSmall++;
            } else if (stringBuilder.charAt(i) >= 'A' && stringBuilder.charAt(i) <= 'Z') {
                countOfBig++;
            }
        }
        System.out.println("small: " + countOfSmall);
        System.out.println("big: " + countOfBig);
    }
}
//If you want to represent any object as a string, toString() method comes into existence. The toString() method returns the string representation of the object. If you print any object, java compiler internally invokes the toString() method on the object.
//small: 198
//big: 6
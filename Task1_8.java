package stringOrStringBuilder;

import java.util.Scanner;

/*
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */

public class Task1_8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(getResult(text));
        sc.close();
    }

    private static String getResult(String str) {
        String result = "";

        String[] words = str.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > result.length()) {
                result = words[i];
            }
        }
        return result;
    }
}
//Когда мы путешествуем, в аэропорту наш багаж пропускают через ленту со сканером.
//путешествуем,

package stringOrStringBuilder;

/*
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

public class Task1_10 {

	public static void main(String[] args) {
        String text = "If you want to represent any object as a string, toString() method comes into existence!"
        		+ " The toString() method returns the string representation of the object?"
        		+ " If you print any object, java compiler internally invokes the toString() method on the object.";
        countOfSentences(text);
    }


    private static void countOfSentences(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '!' || stringBuilder.charAt(i) == '?' || stringBuilder.charAt(i) == '.') {
                count++;
            }
        }
        System.out.println("sentences: " + count);
    }
}
//sentences: 3
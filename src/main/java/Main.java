import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String input = "Maxim Nefedov";
        System.out.println(input);

        System.out.println(reverseString(input));
        System.out.println(reverseStringByDeque(input));
    }

    private static String reverseString(String input) {
        char[] chars = input.toCharArray();
        char[] resultChars = new char[chars.length];
        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = chars[(resultChars.length - 1) - i];
        }
        return new String(resultChars);
    }

    private static String reverseStringByDeque(String input) {
        char[] charArray = input.toCharArray();
        Deque<Character> characters = new LinkedList<>();
        char[] resultArray = new char[charArray.length];
        int counter = charArray.length - 1;
        for (char c : charArray) {
            characters.offer(c);
            resultArray[counter--] = characters.getLast();
        }
        return new String(resultArray);
    }
}

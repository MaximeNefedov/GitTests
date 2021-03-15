import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String input = "Maxim Nefedov";
        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        Deque<Character> characters = new LinkedList<>();
        for (char c : charArray) {
            characters.offer(c);
        }

        char[] resultArray = new char[charArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (characters.getLast() != null) {
                resultArray[i] = characters.pollLast();
            }
        }

        return new String(resultArray);
    }
}

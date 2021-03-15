
public class Main {
    public static void main(String[] args) {
        String input = "Maxim Nefedov";
        System.out.println(input);
        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {
        char[] chars = input.toCharArray();
        char[] resultChars = new char[chars.length];
        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = chars[(resultChars.length - 1) - i];
        }
        return new String(resultChars);
    }
}

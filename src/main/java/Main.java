import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "Maxim Nefedov";
        char[] chars = input.toCharArray();
        char[] resultChars = new char[chars.length];

        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = chars[(resultChars.length - 1) - i];
        }
        System.out.println(Arrays.toString(resultChars));
    }
}

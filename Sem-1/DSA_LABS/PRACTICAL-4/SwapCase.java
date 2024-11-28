import java.util.Scanner;

public class SwapCase {
    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = swapCase(input);
        System.out.println("Swapped case: " + result);
        scanner.close();
    }
}

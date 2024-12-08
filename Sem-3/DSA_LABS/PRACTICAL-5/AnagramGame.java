import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AnagramGame {
    public static boolean isAnagram(String word1, String word2) {
        char[] charArray1 = word1.toLowerCase().toCharArray();
        char[] charArray2 = word2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] words = new String[n];
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        Random random = new Random();
        int randomIndex = random.nextInt(n);
        String selectedWord = words[randomIndex];

        System.out.println("Guess the anagram of the word: " + selectedWord);
        String userAnagram = scanner.nextLine();

        if (isAnagram(selectedWord, userAnagram)) {
            System.out.println("Congratulations! You found the anagram.");
        } else {
            System.out.println("Sorry, that's not an anagram. Try again!");
        }

        scanner.close();
    }
}

package OOPJ_LABS.LAB_6;

import java.util.Scanner;

public class LAB6_3 {
    public static void main(String[] args) {
        new CountOfVowel();
    }
}

class CountOfVowel {
    private String s;
    private boolean play = true;

    public CountOfVowel() {
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to play.");
            System.out.println("Enter 2 to exit.");
            System.out.print("Enter choice : ");
            int ch =inp.nextInt();
            switch (ch) {
                case 1:
                    inp.nextLine();
                    System.out.print("\nEnter String: ");
                    s = inp.nextLine();
                    countVowel();
                    break;
                case 2:
                    System.out.println("\nThanks for playing !!!");
                    play = false;
                    break;
                default:
                    System.out.println("\nEnter valid choice !!!\n");
            }
        } while (play);
        inp.close();
    }

    void countVowel() {
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }
        System.out.print("\nCount of vowels in \"" + s + "\" is : " + vowel + "\n\n");
    }
}

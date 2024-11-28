import java.util.Scanner;

public class VowelOrNot {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        char vowel[]={'a','e','i','o','u'};

        System.out.println("Enter character:");
        char c=inp.nextLine().charAt(0);

        int count=0;
        for(char v:vowel){
            if(Character.toLowerCase(c)==v){
                count++;
            }
        }
        if (count!=0) {
            System.out.println("Charactrer is vowel.");
        } else {
            System.out.println("Character is not vowel.");
        }
        inp.close();
    }
}
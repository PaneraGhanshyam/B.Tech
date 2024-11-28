import java.util.Scanner;

public class VowelOrNot{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter character:");
        char c=inp.next().charAt(0);
        c=Character.toLowerCase(c);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.print("Character is vowel."); 
        }  
        else{
            System.out.print("Character is not vowel.");
        }
        inp.close();
    }
}
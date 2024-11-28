package LAB_4;

import java.util.Scanner;

public class CountOfVowelsAndConsonant {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        int c=0,v=0;

        System.out.println("Enter String:");
        String s=inp.nextLine();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                v++;
            else
                c++;
        }

        System.out.println("Count of consonant is :"+c+" and vowels is :"+v);
        inp.close();
    }
}

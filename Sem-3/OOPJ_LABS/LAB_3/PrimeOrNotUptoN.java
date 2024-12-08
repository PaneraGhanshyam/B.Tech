package LAB_3;

import java.util.Scanner;

public class PrimeOrNotUptoN {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter range:");
        int range=inp.nextInt();

        for(int i=1;i<=range;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i+" ");
                count = 0;
            }else{
                count = 0;
            }
        }

        inp.close();
    }
}

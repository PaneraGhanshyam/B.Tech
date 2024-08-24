import java.util.Scanner;

public class SumOfMatrix {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int matrixA[][]=new int[2][2];
        int matrixB[][]=new int[2][2];
        int matrixC[][]=new int[2][2];

        System.err.print("Enter matrix A:\n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.err.print("Enter Number:");
                matrixA[i][j]=inp.nextInt();
            }
        }

        System.err.print("Enter matrix B:\n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.err.print("Enter Number:");
                matrixB[i][j]=inp.nextInt();
            }
        }

        System.out.print("Sum is:\n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
        inp.close();
    }
    
}

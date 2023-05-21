//   addition of 2X3 matrix array ......
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of r for raw");
        int r=in.nextInt();
        System.out.println("Enter the value of c for raw");
        int c=in.nextInt();
        int M1[][]=new int[r][c];
        int M2[][]=new int[r][c];
        int M3[][]=new int[r][c];
        System.out.println("Enter the elements of matrix 1st-");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                M1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2nd-");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                M2[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                M3[i][j] =M1[i][j]+M2[i][j];
            }
        }
        System.out.println("The Final matrix is:- ");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
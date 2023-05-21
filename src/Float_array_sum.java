//   Sum of float array......
import java.util.Scanner;
public class Float_array_sum {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        float arr[]=new float[n];
        System.out.println("Enter the values of array-");
        for(int i=0;i<n;i++){
             arr[i]=in.nextFloat();
        }
        float sum=0;
        for(int j=0;j<n;j++){
            sum=sum+arr[j];
        }
        System.out.println("The Sum is:- "+sum);
    }
}
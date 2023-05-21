//   reverse of an array......
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array-");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The reverse order of them are: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
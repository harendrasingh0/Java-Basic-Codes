//  Minimum of an array element......
import java.util.Scanner;
public class MinimumInArray {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array-");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int mini=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println("The minimum is :- "+mini);
    }
}
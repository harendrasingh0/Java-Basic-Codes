//  Array is sorted or not......
import java.util.Scanner;
public class SortTestOfArray {
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
        int flag=-1;
        for(int i=0;i<n-1;i++){
            if(mini>arr[i+1]){
                flag=0;
                break;
            }
            else{
                mini=arr[i];
            }
        }
        if(flag==0){
            System.out.println("Array is not sorted");
        }
        else {
            System.out.println("Array is sorted");
        }
    }
}
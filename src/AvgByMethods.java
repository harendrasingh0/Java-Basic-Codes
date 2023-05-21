// Avg by methode......
import java.util.Scanner;
public class AvgByMethods {
    static float avg(int arr[]){
       int n=arr.length;
       int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum/n;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
      int arr[]=new int[n];
        System.out.println("Enter the array elements :-");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The avg by the methode is:- "+avg(arr));
    }
}
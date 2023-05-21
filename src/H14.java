//  Maximum of an array element......
import java.util.Scanner;
public class H14{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int arr[]=new int[n];




        System.out.println("Enter the elements in the array-");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int maxi=0;
       // System.out.println("The reverse order of them are: ");
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        System.out.println("The maximum is :- "+maxi);
    }
}
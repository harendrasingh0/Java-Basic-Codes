//   Check integer is present in the array or not......
import java.util.Scanner;
public class H11{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values in array-");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the value for check: ");
        int check=in.nextInt();
        int flag=-1;
        for(int i=0;i<n;i++){
           if(arr[i]==check){
               System.out.println("The value is find at index "+i);
               flag=0;
               break;
           }
        }
        if(flag==-1){
            System.out.println("The value is not present in the array");
        }
    }
}
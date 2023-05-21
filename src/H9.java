//   Factorial of any number......
import java.util.Scanner;
public class H9{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
           fact=fact*i;
        }
        System.out.println("The factorial is:- "+fact);
    }
}
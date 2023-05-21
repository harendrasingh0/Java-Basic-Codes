// Sum of first even numbers...
import java.util.Scanner;
public class Sum_of_first_even_numbers {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of n numbers is: "+sum);
    }
}
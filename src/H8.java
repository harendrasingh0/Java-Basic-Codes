// table of any number in reverse order..
import java.util.Scanner;
public class H8{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        for(int i=10;i>=1;i--){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
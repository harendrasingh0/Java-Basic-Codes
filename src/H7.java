// table of any number..
import java.util.Scanner;
public class H7{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
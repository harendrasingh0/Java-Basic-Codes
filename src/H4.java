// Star printing
import java.util.Scanner;
public class H4{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of raw and column:");
        int cr=in.nextInt();
        for(int i=0;i<cr;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   //     Fail or pass of student
import java.sql.SQLOutput;
import java.util.*;
public class H2 {
    public static void main(String[] args) {
        System.out.printf("Welcome here..!");
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the three subjects marks of\n1.Math\n2.Science\n3.Computer");
        int m=in.nextInt();
        int s=in.nextInt();
        int c=in.nextInt();
        float avg= (m+s+c)/3;
        if(m<33||s<33||c<33){
            System.out.println("Failed in exam");
        }
        else if(avg<40)
            System.out.println("Failed in exam");
        else
            System.out.println("Congrats you passed in the exam");
    }
}
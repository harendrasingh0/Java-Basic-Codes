  // Tax paid by a person
  import java.util.*;
public class Tax_paid {
    public static void main(String args[]){
        System.out.println("Hello dear employee");
        Scanner in=new Scanner(System.in);
        System.out.println("please enter your salary: ");
        int sal=in.nextInt();
        double tax;
        if(sal<250000)
            System.out.println("No tax to be paid :");
        else if(sal>=250000&&sal<500000){
            tax=sal*(0.05);
            System.out.println("Tax is of 5%: "+tax);
        }
        else if(sal>=500000&&sal<750000){
            tax=sal*(0.2);
            System.out.println("Tax is of 20%: "+tax);
        }
        else if(sal>=1000000){
            tax=sal*(0.3);
            System.out.println("Tax is of 30%: "+tax);
        }
    }
}
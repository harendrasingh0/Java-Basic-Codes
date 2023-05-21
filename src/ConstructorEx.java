// Table by methods......
import java.util.Scanner;
    class Square{
        int side;
    Square(){
        System.out.println("Welcome in the Squared class");
    }
    void area(){
        System.out.println("The area is:- "+side*side);
    }
        void perimeter(){
            System.out.println("The permimeter is:- "+(4*side));
        }
}
public class ConstructorEx{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Square s=new Square();

        System.out.println("Enter the side of square:");
        s.side=in.nextInt();
        s.area();
        s.perimeter();
    }
}
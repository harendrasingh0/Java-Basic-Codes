// Table by methods......
import java.util.Scanner;
class Circle{
    float radius;
    Circle(){
        System.out.println("Welcome in the Circle class");
    }
    void area(){
        System.out.println("The area is:- "+(3.14*radius*radius));
    }
    void circumference(){
        System.out.println("The Circumference is:- "+(2*3.14*radius));
    }
}
public class H19{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Circle ob=new Circle();

        System.out.println("Enter the radius of circle:");
        ob.radius=in.nextInt();
        ob.area();
        ob.circumference();
    }
}
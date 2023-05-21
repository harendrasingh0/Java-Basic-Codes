//  volume of cylinder by inheritance......
//Doubt
import java.util.Scanner;
class Circle1{
     int radius;

    Circle1(){
        System.out.println("Welcome in the Circle class");
    }

      void area() {
        System.out.println("The Area of circle is:- " + (3.14 * radius * radius));
    }
}
    class Cylinder2 extends Circle{
    int height;
    Cylinder2(){
        System.out.println("Welcome in the Cylinder class");

    }
    void volume(){
        System.out.println("The volume of the cylinder is: "+(3.14*radius*radius*height));
    }

}
public class H22{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        Circle1 ob=new Circle1();
        System.out.println("Enter the radius :");
        ob.radius=in.nextInt();

        Cylinder2 obj=new Cylinder2();
        System.out.println("Enter the height of Cylinder:");
        obj.height=in.nextInt();

        ob.area();
        obj.volume();


    }
}
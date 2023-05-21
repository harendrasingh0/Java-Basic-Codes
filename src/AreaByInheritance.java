// area of cylinder by Getters and Setters......
import java.util.Scanner;
class Cylinder1{
    private int radius;
    private int height;
    Cylinder1(){
        System.out.println("Welcome in the Cylinder class");
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int n){
        radius=n;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int n){
        height=n;
    }
    public void volume(){
        System.out.println("The volume is:- "+(3.14*radius*radius*height));
    }
    public void baseArea(){
        System.out.println("The base area is:- "+(3.14*radius*radius));
    }

}
public class AreaByInheritance{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Cylinder1 ob=new Cylinder1();

        System.out.println("Enter the radius of Cylinder:");
        int r=in.nextInt();
        System.out.println("Enter the height of Cylinder:");
        int h=in.nextInt();

        ob.setRadius(r);
        ob.setHeight(h);

        ob.baseArea();
        ob.volume();
    }
}
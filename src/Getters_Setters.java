// Getters and Setters......
import java.util.Scanner;
class Cylinder{
   private int radius;
    private int height;
    Cylinder(){
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
    public
    void area(){
        System.out.println("The area is:- "+(3.14*radius*radius));
    }

}
public class Getters_Setters{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Cylinder ob=new Cylinder();

        System.out.println("Enter the radius of Cylinder:");
        int r=in.nextInt();
        System.out.println("Enter the height of Cylinder:");
        int h=in.nextInt();

        ob.setRadius(r);
        ob.setHeight(h);
        System.out.println("The Radius is "+ob.getRadius());
        System.out.println("The Height is "+ob.getHeight());
    }
}
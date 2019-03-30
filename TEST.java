
package air_traffic_controller;

import java.util.Scanner;


public class TEST {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Height of Rectangle:");
        int x=in.nextInt();
        System.out.println("Enter Width of Rectangle:");
        int y=in.nextInt();
        System.out.println("Enter Radius of Circle:");
        int r=in.nextInt();
        
        MathTech rectangle=new MathTech(x,y);
        System.out.println("Area of rectangle "+rectangle.areaOfRectangle(x, y));
        System.out.println("perimeter Of Rectangle "+rectangle.perimeterOfRectangle(x, y));
        MathTech circle=new MathTech(r);
        
        System.out.println("Area Of Circle "+circle.areaOfCircle(r));
        System.out.println("Perimeter Of Circle "+circle.perimeterOfCircle(r));
        
    }
    
}

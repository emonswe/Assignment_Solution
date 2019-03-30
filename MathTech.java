
package air_traffic_controller;


public class MathTech {
    int height;
    int width;
    int radius;
    double PI=3.14159;
    MathTech(int height, int width ){
    this.height=height;
    this.width=width;
}
    MathTech(int radius){
        this.radius=radius;
        
}
    double areaOfRectangle(int height, int width){
        return height*width;
    }
    double perimeterOfRectangle(int height, int width){
        return 2*(height+width);
    }
    double areaOfCircle(int radius){
        
        return PI*(radius*radius);
    }
    double perimeterOfCircle(int radius){
        return 2*PI*radius;
    }
}

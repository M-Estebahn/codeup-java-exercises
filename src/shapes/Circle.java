package shapes;
import java.lang.Math.*;
public class Circle {
    private double radius;

    public Circle(double radius){
    }

    public double getArea(){
       return this.radius*this.radius*Math.PI;
    }
    public double getCircumfrence(){
        return 2*Math.PI*this.radius;
    }

}



package shapes;

public class Circle {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
       return this.radius*this.radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double userRadius){
        this.radius=userRadius;
    }
}



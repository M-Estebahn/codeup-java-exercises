package shapes;

public class Square extends Quadrilateral{

    protected Square(double side) {
        super();
        super.length=side;
        super.width=side;
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }

    @Override
    public double getArea() {
        return this.length*width;
    }
}

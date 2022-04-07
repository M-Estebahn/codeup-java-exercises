package shapes;

public class Rectangle extends Quadrilateral implements Measurable  {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public void setLength(int side) {
        length=side;

    }

    @Override
    public void setWidth(int side) {
        width=side;

    }

    @Override
    public double getPerimeter() {
        return this.length*2+this.width*2;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }
}

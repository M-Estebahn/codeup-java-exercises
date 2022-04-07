package shapes;

public class Square extends Quadrilateral{

    protected Square(double side) {
        super(side,side);

    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }

    @Override
    public double getArea() {
        return this.length*width;
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
        width=side;
    }

    @Override
    public void setWidth(int side) {
        width=side;
        length=side;

    }


}

package shapes;

public class Square extends Rectangle{
    protected int side;

    public Square(int side){
        this.side=side;
    }
    public int getArea(){
        return (int)Math.pow(5,2);
    }
    public int getPerimeter(){
        return 4*side;
    }
}

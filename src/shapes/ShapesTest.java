package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Quadrilateral box1=new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Quadrilateral box2= new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
        Measurable MyShape=new Square(5);
        Measurable MyOtherShape=new Rectangle(4,5);

        System.out.println(MyShape.getArea());
        System.out.println(MyShape.getPerimeter());
        System.out.println(MyOtherShape.getArea());
        System.out.println(MyOtherShape.getPerimeter());
        System.out.println(MyOtherShape);
        System.out.println(MyShape);
    }
}

package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Circle firstCircle=new Circle(.25);
        Circle secondCircle=new Circle(.50);
        System.out.println(firstCircle.getCircumference());
        System.out.println(firstCircle.getArea());
        System.out.println(secondCircle.getCircumference());
        System.out.println(secondCircle.getArea());
        System.out.println(firstCircle.getRadius());
        System.out.println(secondCircle.getRadius());

       Input userInput=new Input();
       double userRadius=userInput.getDouble();


        Circle userCircle=new Circle(userRadius);
        System.out.println(userCircle.getRadius());
        System.out.println(userCircle.getCircumference());
        System.out.println(userCircle.getArea());






    }

}

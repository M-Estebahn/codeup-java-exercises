package util;

class InputTest{
    public static void main(String[] args) {

        Input input1= new Input();
        System.out.println("input1 = " + input1.getString());

        System.out.println("input1.getInt() = " + input1.getInt());

        System.out.println("input1.yesNo() = " + input1.yesNo());

        System.out.println("input1.getInt(20,100) = " + input1.getInt(20, 100));

        System.out.println("input1.getDouble(.01,.99) = " + input1.getDouble(.01, .99));

        System.out.println("input1.getDouble() = " + input1.getDouble());


    }
}
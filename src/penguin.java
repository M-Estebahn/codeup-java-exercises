public class penguin extends Bird{
    public void makeNoise(){
        System.out.println("Squawk");
    }
    public void move(){
        super.makeNoise();
        System.out.println("bloop");
    }
}

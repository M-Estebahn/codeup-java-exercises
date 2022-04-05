public class BirdTest {
        public static void main(String[] args) {
            Bird cardinal = new Bird();
            cardinal.setName("Cardinal");
            cardinal.setCanFly(true);
            cardinal.makeNoise();
            cardinal.move();

            Duck mallard=new Duck();
            mallard.setName("Mallard Duck");
            mallard.makeNoise();
            mallard.move();

            penguin poppy=new penguin();
            poppy.setName("Poppy");
            poppy.makeNoise();
            poppy.move();
    }
}

class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.print("Cost:" + costInCents + "\n"+"name: " + nameOfDish + "\n" + "Recommend: " + wouldRecommend+"\n");
    }
}
public class DishTest {
    public static void main(String[] args) {
        Dish Dish2 = new Dish();
        Dish Dish1 = new Dish();
        Dish1.costInCents = 1000;
        Dish1.nameOfDish = "Pepper Steak";
        Dish1.wouldRecommend = true;
        Dish2.nameOfDish = "Gumbo";
        Dish2.costInCents = 1200;
        Dish2.wouldRecommend = true;
//        System.out.println(Dish1.nameOfDish);
//        System.out.println(Dish2.nameOfDish);
        Dish1.printSummary();
        Dish2.printSummary();
    }
}

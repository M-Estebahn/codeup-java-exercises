import java.util.Locale;

class Dish {
    private int costInCents;
    private  String nameOfDish;
    private boolean wouldRecommend;

    static long totalDishes = 0;

    public Dish() {
        totalDishes++;
    }

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this();
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public  String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {
        System.out.print("Cost:" + costInCents + "\n" + "name: " + nameOfDish + "\n" + "Recommend: " + wouldRecommend + "\n");
    }



}

class DishTools {
    public   static String ShoutDishName(Dish dish) {
        return dish.getNameOfDish().toUpperCase(Locale.ROOT);
    }

    static final int AVG_COST_OF_DISH_IN_CENTS = 1300;

    static String analyzeDishCost(Dish dish) {
        if (dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENTS) {
            return dish.getNameOfDish() + " is More Expensive than Average";
        }
        if (dish.getCostInCents() < AVG_COST_OF_DISH_IN_CENTS) {
            return dish.getNameOfDish() + " is Less Expensive than Average";
        }
        return dish.getNameOfDish() + " is Average Price";
    }

    static void flipRecommendation(Dish dish) {
        dish.setWouldRecommend(!dish.isWouldRecommend());
    }
}




public class DishTest {
    public static void main(String[] args) {
        Dish Dish2 = new Dish(1200,"Gumbo",true);
        Dish Dish1 = new Dish();
        Dish1.setCostInCents(1400);
        Dish1.setNameOfDish("Pepper Steak");
        Dish1.setWouldRecommend(true);
        System.out.println(Dish1.getNameOfDish());
        System.out.println(Dish2.getNameOfDish());
        Dish1.printSummary();
        Dish2.printSummary();
        System.out.println("Dish1 = " + DishTools.ShoutDishName(Dish1));
        System.out.println(DishTools.analyzeDishCost(Dish1));
        System.out.println(DishTools.analyzeDishCost(Dish2));
        DishTools.flipRecommendation(Dish2);
        System.out.println("Dish2 = " + Dish2.isWouldRecommend());
       DishTools.flipRecommendation(Dish2);
        System.out.println("Dish2 = " + Dish2.isWouldRecommend());
    }
}
//Java_Programming_Masterclass  - Udemy Class (only get if on sale) help out some…. it’s long though
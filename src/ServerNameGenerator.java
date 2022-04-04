import java.util.Random;

public class ServerNameGenerator {

   private static String [] adjectives={"Happy","Fast","Smelly","Wise","Wild","Clean","Dirty","Slow","Strong","Angry"};

   private static String[] nouns={"Opossum","Dude","Toaster","Bruja","Cantaloupe","Frisbee","Juice box","Lemon Rind","Goblin","Weirdboy"};



    public static String generateRandomName(String[] arr1, String[] arr2){
        Random generator = new Random();
        int randomIndex = generator.nextInt(arr1.length);
        int randomIndex2= generator.nextInt(arr2.length);
        return arr1[randomIndex]+"-"+arr2[randomIndex2];

    }

    public static void main(String[] args) {



        System.out.println(generateRandomName(adjectives,nouns));
        System.out.println(generateRandomName(adjectives,nouns));
        System.out.println(generateRandomName(adjectives,nouns));
    }


}

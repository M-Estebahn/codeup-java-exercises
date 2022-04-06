import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        Person kevin=new Person("Kevin");
        Person james=new Person("James");
        Person tommy=new Person("Tom");
        ArrayList<Person> people=new ArrayList<>();

        people.add(kevin);
        people.add(james);
        people.add(tommy);

        for (Person person: people){
            System.out.println(person.getName());
        }

    }
}

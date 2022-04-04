import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person john=new Person("John");
        Person mark=new Person("Mark");
        Person tim=new Person("Tim");
        Person fred=new Person("Fred");

        Person[] people ={john,mark,tim};

        for(Person person: people){
            System.out.println(person.getName());
        }
        Person[] anotherPersonInPeople=addPerson(people,fred);

        for (Person person: anotherPersonInPeople){
            System.out.println(person.getName());
        }

    }
        public static  Person[] addPerson(Person[] people ,Person human){
        Person [] people1;
        people1=new Person[people.length+1];
        for (int i=0;i<people.length;++i){
            people1[i]=people[i];
        }
        people1[people.length]=human;
        return people1;
        }



}

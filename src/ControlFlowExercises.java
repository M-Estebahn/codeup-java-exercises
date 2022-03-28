public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

       long start = 2;

        do {
            System.out.println(start);
            start*=start ;
        } while (start <= 1000000);


    }
}

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//       long start = 2;
//
//        do {
//            System.out.println(start);
//            start*=start ;
//        } while (start <= 1000000);

//        for (int i=5 ; i<=15 ; i++){
//            System.out.println(i);
//        }
//        for (long  i=2;i<=100000000; i*=i){
//            System.out.println(i);
//        }
        for(int i=0; i<=100;++i){
            if(i % 3 ==0 && i % 5 ==0) {
            System.out.println("FizzBuzz");
                continue;
        }if (i%3 == 0){
             System.out.println("Fizz");
                continue;
            }if (i%5==0){
                System.out.println("Buzz");

            }else{
                System.out.println(i);
            }
        }
    }
}

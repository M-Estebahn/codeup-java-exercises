package util;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        solution(40);
    }
    public static String[] solution(int x){

        ArrayList<String> fibonacci= new ArrayList<>();

        fibonacci.add("0");
        fibonacci.add("1");

        do{
          fibonacci.add(String.valueOf(Long.parseLong(fibonacci.get(fibonacci.size()-1))+Long.parseLong(fibonacci.get(fibonacci.size()-2))));
        }while(fibonacci.size()<x);

        System.out.println(fibonacci);

        return fibonacci.toArray(String[]::new);
    }

}


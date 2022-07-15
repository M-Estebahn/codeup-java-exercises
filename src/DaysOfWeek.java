import java.util.ArrayList;

public class DaysOfWeek {
    public static void main(String[] args) {
        nextDay("Sat",23);
    }
    public static String nextDay(String s, int k){
        ArrayList<String> daysofweek= new ArrayList<>();

        daysofweek.add("Mon");
        daysofweek.add("Tue");
        daysofweek.add("Wed");
        daysofweek.add("Thu");
        daysofweek.add("Fri");
        daysofweek.add("Sat");
        daysofweek.add("Sun");
        System.out.println(daysofweek);

//       start point in array
       int d = daysofweek.indexOf(s);
       int count=0;

       for(int i=0; i<k ;i++){
           count++;

           if(count>6){
               count=0;
           }

       }
        System.out.println(count);
        System.out.println(daysofweek.get(d+count-7));
        if(d+count<=6){
            return daysofweek.get(d+count);
        }else{
            return daysofweek.get(d+count-7);
        }





    }
}

import java.util.ArrayList;

public class Bubbles {
    public static void main(String[] args) {
        int[] numbers= {5,2,8,9,6,2,5,7,4,12,19,78,43,65,23,6,8,65};

        bubbleSort(numbers);
    }
    public static   int[]  bubbleSort(int[] arr){
        int i,j,temp=0;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        };
        return arr;
    }
}

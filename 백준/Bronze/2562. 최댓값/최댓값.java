import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;
        int index = 0;

        for(int i = 0; i<arr.length; i++){
            count++;
            if(arr[i]>max){
                max = arr[i];
                index = count;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
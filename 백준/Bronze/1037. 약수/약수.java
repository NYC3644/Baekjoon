import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), max = 0, min=1000001;
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
            if(max<A[i])
                max = A[i];
            if(min>A[i])
                min = A[i];
        }
        System.out.println(max*min);
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), max = 0, min=1000001;
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        sc.close();
        System.out.println(max*min);
    }
}
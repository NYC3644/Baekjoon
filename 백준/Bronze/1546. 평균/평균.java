import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double max = 0, a = 0;
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max)
                max = arr[i];
        }
        for(int i = 0; i<N; i++){
            a += arr[i]*100/max;
        }
        a = a/N;
        System.out.println(a);
    }
}

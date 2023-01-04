import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), count = 1;
        String str = sc.next();
        for(int i =0; i<N; i++){
            char c = str.charAt(i);
            if (c != 'S') {
                i++;
            }
            count++;
        }
        if(count>N)
            System.out.println(N);
        else
            System.out.println(count);
    }
}
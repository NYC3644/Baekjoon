import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt(), count = 0, score = 0;
        for(int i = 0; i<N; i++){
            String str = sc.next();
            for(int j = 0; j<str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    score += count;
                } else
                    count = 0;
            }
            System.out.println(score);
            score = 0;
            count = 0;
        }
    }
}
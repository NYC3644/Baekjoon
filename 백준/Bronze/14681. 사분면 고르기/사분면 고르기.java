import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), Y = sc.nextInt();
        System.out.println(X>0?Y>0?1:4:X<0&&Y>0?2:3);
    }
}
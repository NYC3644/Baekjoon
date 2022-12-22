import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A%100==0&&A%400!=0?0:A%4==0?1:0);
    }
}
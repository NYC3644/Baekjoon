import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if (A==B){
            if(B==C){
                System.out.println(10000+A*1000);
            }
            else
                System.out.println(1000+A*100);
        }
        else if(A==C)
        {
            System.out.println(1000+A*100);
        } 
        else if (B==C) {
            System.out.println(1000+B*100);
        } else
            System.out.println(A>B?A>C?A*100:C*100:B>C?B*100:C*100);
    }
}
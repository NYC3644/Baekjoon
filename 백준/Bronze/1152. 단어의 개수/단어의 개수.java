import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] str1 = str.split(" ");
        if(str1[0].equals("")) {
            System.out.println(0);
        }else {
            System.out.println(str1.length);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String minA = "";
        String maxA = "";
        String minB = "";
        String maxB = "";

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '6') {
                minA = minA + "5";
            }else {
                minA = minA + a.charAt(i);
            }

            if(a.charAt(i) == '5') {
                maxA =  maxA + "6";
            }else {
                maxA = maxA + a.charAt(i);
            }
        }

        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) == '6') {
                minB = minB + "5";
            }else {
                minB = minB + b.charAt(i);
            }

            if(b.charAt(i) == '5') {
                maxB =  maxB + "6";
            }else {
                maxB = maxB + b.charAt(i);
            }
        }

        int max = Integer.parseInt(maxA) +  Integer.parseInt(maxB);
        int min = Integer.parseInt(minA) +  Integer.parseInt(minB);

        System.out.println(min + " " + max);
    }
}
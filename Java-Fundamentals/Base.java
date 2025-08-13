import java.util.*;

public class Base{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and exponent");
        int base = sc.nextInt();
        int expo = sc.nextInt();

        int ans = (int)Math.pow(base,expo);
        System.out.println("the ans is"+ans);
    }
    }
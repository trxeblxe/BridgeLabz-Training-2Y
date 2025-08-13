import java.util.*;

public class Avg{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("avg is"+avg);
    }}
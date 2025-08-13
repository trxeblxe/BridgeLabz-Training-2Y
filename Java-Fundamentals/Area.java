import java.util.*;
public class Area{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Radius");
        float radius = sc.nextFloat();
        float pi = 22 / 7;
        float Area =  pi * radius*radius;
        System.out.println("area of circle is"+Area);

    }
}
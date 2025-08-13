import java.util.*;
public class Intrest{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of p r then t");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        float intrest = (p*r*t)/100;
        System.out.println("Intrest is"+intrest);
    }
}
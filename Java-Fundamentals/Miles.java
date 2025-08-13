import java.util.*;

public class Miles{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the km");
        float km = sc.nextFloat();
        float d = 0.621371f;
        float miles = km * d;
        System.out.println("km to miles is"+miles);
    }}

        

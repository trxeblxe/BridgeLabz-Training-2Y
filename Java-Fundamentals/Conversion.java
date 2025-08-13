import java.util.*;
public class Conversion{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the celcius value");
        float cel = sc.nextFloat();

        
        float Fahrenheit = (cel * 9/5) + 32;
        System.out.println("Temp in Fahrenheit is " + Fahrenheit);
    }
}
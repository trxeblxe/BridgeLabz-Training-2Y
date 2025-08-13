import java.util.*;
public class Volume{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Radius");
        float radius = sc.nextFloat();
        System.out.println("enter the Height");
        float  height = sc.nextFloat();

        float pi = 22 /7 ;
        float Volume =  pi * radius*radius*height;
        System.out.println("Volume of cylinder is"+Volume);

    }
}
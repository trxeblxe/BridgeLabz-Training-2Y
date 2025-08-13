import java.util.*;
public class Rectangle{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length then breath");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int peri = 2*(l+b);
        System.out.println("Perimeter of a Rectangle"+peri);
    }}
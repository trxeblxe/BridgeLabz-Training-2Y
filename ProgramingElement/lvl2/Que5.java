import java.util.Scanner;

public class Que5 {
    public static void main(String[] args){
        int price , quantity;
        Scanner input = new Scanner(System.in);
        price = input.nextInt();
        quantity = input.nextInt();
        int total = price*quantity;
        System.out.println("The total purchase price is INR"+ total +"if the quantity"+ quantity +" and unit price is INR"+price);

    }}
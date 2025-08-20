import java.util.Scanner;

public class Que6 {
    public static void main(String[] args){
        int num1,num2 ;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        int quo = num1/num2;
        int rem = num1%num2;
        System.out.println("The Quotient is"+ quo +"and Reminder is"+ rem+" of two number"+ num1 +"and"+num2);    
        }}
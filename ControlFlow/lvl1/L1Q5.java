import java.util.Scanner;

public class L1Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age % 18 == 0){
            System.out.println(" The person's age is"+age+"and can vote");
        }
        else{
             System.out.println(" The person's age is"+age+"and can not vote");
        }

    }
}
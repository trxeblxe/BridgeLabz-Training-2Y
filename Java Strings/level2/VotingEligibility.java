import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + (int)(Math.random() * 90); // random 2-digit age (10-99)
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s %-10s%n", "Age", "Can Vote");
        System.out.println("----------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-10s%n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter age of student " + (i + 1) + ":");
            ages[i] = sc.nextInt();
        }

        String[][] eligibility = checkVotingEligibility(ages);
        displayTable(eligibility);

        sc.close();
    }
}

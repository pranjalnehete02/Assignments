import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's percentage: ");
        int percentage = scanner.nextInt();

        String grade = getGrade(percentage);

        System.out.println("Student's grade: " + grade);
    }

    public static String getGrade(int percentage) {
        if (percentage < 0 || percentage > 100) {
            return "Invalid percentage";
        } else if (percentage <= 50) {
            return "Pass";
        } else if (percentage <= 60) {
            return "Second Class";
        } else if (percentage <= 75) {
            return "First Class";
        } else {
            return "Distinction";
        }
    }
}
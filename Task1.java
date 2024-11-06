import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        // Input student grades
        System.out.println("Enter student grades (type '-1' to finish):");

        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            }
        }

        // If no grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }

        // Compute the average, highest, and lowest scores
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / grades.size();

        System.out.println("\nGrade Summary:");
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

        scanner.close();
    }
}

import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] grades = new int[n];

        int total = 0;
        int highest, lowest;

        // Input student details
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // clear buffer

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter grade: ");
            grades[i] = sc.nextInt();

            total += grades[i];
        }

        highest = grades[0];
        lowest = grades[0];

        // Find highest and lowest grades
        for (int i = 1; i < n; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = (double) total / n;

        // Summary Report
        System.out.println("\n===== STUDENT SUMMARY REPORT =====");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + grades[i]);
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        sc.close();
    }
}
import java.util.*;

public class StudentGradeCalc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for his name
        System.out.print("Enter the student name: ");
        String stuName= scanner.nextLine();

        // Ask the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();

        // Create an array to store marks of each subject
        int marks[] = new int[numSub];
        int totalMarks = 0;

        // Loop to input marks for each subject and calculate total marks
        for (int i = 0; i < numSub; i++) {
            System.out.printf("Enter marks obtained in subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double avgPercent = ( (double) totalMarks / (numSub * 100) ) * 100;

        // Determine the grade based on the average percentage
        char grade;
        if (avgPercent >= 90) {
            grade = 'A';
        } else if (avgPercent >= 80) {
            grade = 'B';
        } else if (avgPercent >= 70) {
            grade = 'C';
        } else if (avgPercent >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results to the user
        System.out.println("\nHere the Results of " + stuName + ":");
        System.out.println("Total Marks obtained: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercent + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

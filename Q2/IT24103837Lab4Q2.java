import java.util.Scanner;

public class IT24103837Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        if (!(examMarks >= 0 && examMarks <= 100)) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            input.close();
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        if (!(labMarks >= 0 && labMarks <= 100)) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            input.close();
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        if (!(examPercentage >= 0 && examPercentage <= 100
                && labPercentage >= 0 && labPercentage <= 100)) {
            System.out.println("Invalid percentages. Terminating program.");
            input.close();
            return;
        }

        if (Math.abs(examPercentage + labPercentage - 100) > 0.000001) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            input.close();
            return;
        }

        double finalMark = examMarks * examPercentage / 100
                         + labMarks * labPercentage / 100;
        System.out.println();
        System.out.println("Final Exam Mark is : " + finalMark);

        input.close();
    }
}

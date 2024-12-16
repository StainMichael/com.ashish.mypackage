import java.util.Scanner;
import java.util.Random;

public class main {
    private static int score = 0;
    private static int totalQuestions = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Calculator Mini-Game!");
        System.out.println("You will be asked " + totalQuestions + " questions.");
        System.out.println("For each correct answer, you will earn 1 point.");
        System.out.println("Let's get started!\n");

        for (int i = 0; i < totalQuestions; i++) {
            int num1 = random.nextInt(10); // Random number between 0 and 9
            int num2 = random.nextInt(10); // Random number between 0 and 9
            char operator = getRandomOperator();

            System.out.print("Question " + (i + 1) + ": What is " + num1 + " " + operator + " " + num2 + "? ");
            double userAnswer = scanner.nextDouble();
            double correctAnswer = calculateAnswer(num1, num2, operator);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + correctAnswer);
            }
            System.out.println();
        }

        System.out.println("Game Over! Your score: " + score + "/" + totalQuestions);
        scanner.close();
    }

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*', '/'};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    private static double calculateAnswer(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    return 0; // Handle division by zero
                }
            default:
                return 0;
        }
    }
}
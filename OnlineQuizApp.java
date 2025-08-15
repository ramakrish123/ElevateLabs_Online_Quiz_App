import java.util.Scanner;

class Question {
    String questionText;
    String[] options;
    int correctAnswer; 

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean askQuestion(Scanner sc) {
        System.out.println("\n" + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Enter your answer (1-" + options.length + "): ");
        int userAnswer = sc.nextInt();
        return userAnswer == correctAnswer;
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] quiz = {
            new Question("What is the capital of India?",
                    new String[]{"Mumbai", "New Delhi", "Kolkata", "Chennai"}, 2),
            new Question("Which language is used for Android app development?",
                    new String[]{"Python", "Kotlin", "C++", "Java"}, 2),
            new Question("Who is known as the Father of Computers?",
                    new String[]{"Charles Babbage", "Alan Turing", "Bill Gates", "Steve Jobs"}, 1),
            new Question("Which planet is known as the Red Planet?",
                    new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 2),
            new Question("What is the square root of 144?",
                    new String[]{"10", "11", "12", "14"}, 3)
        };

        System.out.println("=== Welcome to the Online Quiz App ===");
        int score = 0;
        for (Question q : quiz) {
            boolean correct = q.askQuestion(sc);
            if (correct) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("\n=== Quiz Completed ===");
        System.out.println("Your score: " + score + "/" + quiz.length);

        if (score == quiz.length) {
            System.out.println("Excellent! Perfect score!");
        } else if (score >= quiz.length / 2) {
            System.out.println("Good job! You can do even better!");
        } else {
            System.out.println("Keep practicing!");
        }

        sc.close();
    }
}

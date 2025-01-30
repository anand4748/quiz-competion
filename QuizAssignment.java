


import java.util.Scanner;

class Question {
    String id;
    String question;
    String[] options;
    String correctAnswer;


    public Question(String id,String question, String[] options, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        
        
    }

    public String getId() {
        return id;
    }
    

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    
}


public class QuizApplication {
     static Question[] questions = new Question[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        questions[0] = new Question("Q1", "how do you create a varable with  numeric value 5?", new String[]{"num x=5", "x=5;", "int x=5", "foloat x=5"}, "int x=5" );
        questions[1] = new Question("Q2", "Which method can be used to find the length of string?", new String[]{"getsize()", "getlength()", " len()", "lenght()"}, "lenght()");
        questions[2] = new Question("Q3", "Which operator is used to add togher two vaues?", new String[]{"The * sign", "The + sign", "the & sign", "the # sign"}, "The + sign");
        questions[3] = new Question("Q4", "Which operator is used to sow modules of vaues?", new String[]{"The * sign", "The + sign", "the - sign", "the % sign"}, "The % sign");
        questions[4] = new Question("Q5", "void show which value?", new String[]{"0", "1", "0 or 1", "Null"}, "null");

        
        
   startQuiz();
         }
     
        
     
         public static void startQuiz() {
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        
        for (Question question : questions) {
            if (question != null) {
                System.out.println(question.getQuestion());
                for (int i = 0; i < question.getOptions().length; i++) {
                    System.out.println((i + 1) + ". " + question.getOptions()[i]);
                }

                System.out.print("Enter your answer (1-" + question.getOptions().length + "): ");
                int answer = scanner.nextInt() - 1;

                if (question.getOptions()[answer].equals(question.getCorrectAnswer())) {
                    correctAnswers++;
                    System.out.println("Correct!");
                } else {
                    incorrectAnswers++;
                    System.out.println("Incorrect. The correct answer is " + question.getCorrectAnswer());
                }
            }
        }
        
        
        displayFinalScore(correctAnswers, incorrectAnswers);
    }

    public static void displayFinalScore(int correctAnswers, int incorrectAnswers) {
        int totalQuestions = correctAnswers + incorrectAnswers;
        double percentage = ((double) correctAnswers / totalQuestions) * 100;

        System.out.println("Quiz complete! Your final score is:");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Incorrect answers: " + incorrectAnswers);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 0 && percentage <= 25) {
            System.out.println("You must study much harder!");
        } else if (percentage >= 26 && percentage <= 50) {
            System.out.println("You are studying good, need some more study!");
        } else if (percentage >= 51 && percentage <= 75) {
            System.out.println("You are a topper! Just a bit of extra effort!");
        } else if (percentage >= 76 && percentage <= 100) {
            System.out.println("You are very good! Best of luck for the next round!");
        }
    }}
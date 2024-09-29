import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int index = 0;

    public Quiz(int numOfQs) {
        questions = new Question[numOfQs];
    }

    public void addQuestion(Question question){
        if(index < questions.length) {
            questions[index] = question;
            index++;
        } else {
            System.out.println("Cannot add more questions, quiz is full. ");
        }
    }
    public void runQuiz(){
        for(Question question : questions) {
            question.displayQuestion();
            System.out.println("Your answer: ");
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if(question.checkAnswer(answer)){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect.");
            }
        }
    }
}

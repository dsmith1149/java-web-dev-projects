public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(3); // Create a quiz with 3 questions

        // Create multiple-choice question
        String[] mcOptions = {"7", "4", "3", "5"};
        MultipleChoice mcQuestion = new MultipleChoice("What is 2 + 2? Enter the number of the answer and not the option number: ", mcOptions, "4");

        // Create checkbox question
        String[] cbOptions = {"Red", "Green", "Blue", "Yellow"};
        String[] correctCbAnswers = {cbOptions[0], cbOptions[2], cbOptions[3]};
        Checkbox cbQuestion = new Checkbox("Select the primary colors:", cbOptions, correctCbAnswers);

        // Create true/false question
        TrueFalse tfQuestion = new TrueFalse("The earth is flat.", false);

        // Add questions to the quiz
        quiz.addQuestion(mcQuestion);
        quiz.addQuestion(cbQuestion);
        quiz.addQuestion(tfQuestion);

        // Run the quiz
        quiz.runQuiz();
    }
}

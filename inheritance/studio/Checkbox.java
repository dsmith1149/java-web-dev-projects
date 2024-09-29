public class Checkbox extends Question {
    private String[] options;
    private String[] realAnswer;

    public Checkbox(String question, String[] options, String[] realAnswer) {
        super(question);
        this.options = options;
        this.realAnswer = realAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestion());
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        String[] answers = answer.split(",");
        if (answers.length != realAnswer.length) {
            return false;
        }
        for (int i = 0; i < realAnswer.length; i++) {
            if (answers[i].trim().equals(realAnswer[i])) {
                return false;
            }
        }
        return true;
    }
}

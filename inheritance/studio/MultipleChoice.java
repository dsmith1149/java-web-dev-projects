public class MultipleChoice extends Question{
private String[] options;
private String realAnswer;
    public MultipleChoice(String question, String[] options, String realAnswer) {
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
        return answer.equals(realAnswer);
    }
}

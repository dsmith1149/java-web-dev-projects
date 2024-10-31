public class TrueFalse extends Question{
    private boolean realAnswer;

    public TrueFalse(String question, boolean realAnswer) {
        super(question);
        this.realAnswer = realAnswer;
    }
public void displayQuestion(){
    System.out.println(getQuestion() + "(True/False)");
}
public boolean checkAnswer(String answer){
        return Boolean.parseBoolean(answer) == realAnswer;
}
}

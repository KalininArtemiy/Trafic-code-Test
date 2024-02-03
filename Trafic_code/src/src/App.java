package src;

public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question.QuestionBuilder().setBody().setAnswerVariants().setCorrectAnsers().build();
        Question.showQuestion(question);

    }
}

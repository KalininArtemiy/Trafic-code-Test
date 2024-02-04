package src;

import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question.QuestionBuilder().setBody().setAnswerVariants().setCorrectAnsers().build();
        Question.showQuestion(question);
        Set answer = UserAnswer.FillAnswers();
        Controller.CamparingAnswers(question, answer);
    }
}

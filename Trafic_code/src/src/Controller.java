package src;
import java.util.Set;

public class Controller {
    Question question;
    UserAnswer userAnswer; 

    public static void CamparingAnswers(Question question, Set userAnswer){
        if (question.correct_answer.equals(userAnswer) ) {
            System.err.println("Задание решено верно.");
        }
        else System.out.println("Задание решено неверно.");
    }
}

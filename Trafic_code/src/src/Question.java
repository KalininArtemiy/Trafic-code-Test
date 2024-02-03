package src;
import java.util.HashMap; // импортируем модули Set и HashMap
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Класс Вопрос
 *      Строка ТелоВопроса
 *      Множество ПравильыйОтвет
 *      Словарь Число-Ответ - выводится пользователю для выбора ответа
 */
 class Question {
    String Body;
    Set correct_answer;
    HashMap <Integer, String> answer_variants;
   
   // Конструктор класса Вопрос
    public Question(String body, Set correct_answer, HashMap<Integer, String> answer_variants) {
        Body = body;
        this.correct_answer = correct_answer;
        this.answer_variants = answer_variants;
    }

    public static class QuestionBuilder {
        String Body;
        HashMap <Integer, String> answer_variants;
        Set correct_answer;

        public QuestionBuilder setBody(){
            System.out.println("Введите текст вопроса ");
            Scanner scaner = new Scanner(System.in);
            String text = scaner.nextLine();
            this.Body = text;
            //ddscaner.close();
            System.out.println();
            return this;

        }
        public QuestionBuilder setCorrectAnsers(){
            this.correct_answer = new HashSet<>();
            System.out.println("Введите Количество правильных ответов ");
            Scanner amountscaner = new Scanner(System.in);
            Integer amount = amountscaner.nextInt();
            Scanner correctAnswersscaner = new Scanner(System.in);
            System.out.println();
            System.out.println("Введите номера правильных ответов ");
            for (int i = 0; i < amount; i++ ){
                Integer answer = correctAnswersscaner.nextInt();
                correct_answer.add(answer);
            }
            //amountscaner.close();
            //correctAnswersscaner.close();
            return this;
        }

        public QuestionBuilder setAnswerVariants(){
            this.answer_variants = new HashMap<>();
            System.out.println("Введите Количество ответов ");
            Scanner amountscaner = new Scanner(System.in);
            Integer amount = amountscaner.nextInt();
            Scanner textOfanswer = new Scanner(System.in);
            System.out.println();
            for (int i = 1; i < (amount+1); i++ ){
                System.out.println("Введите текст " + (i) + " ответа" );
                String text = textOfanswer.nextLine();
                answer_variants.put(i, text);
                System.out.println();
            }
            //amountscaner.close();
            //textOfanswer.close();
            return this;
        }
        public Question build() {
            return new Question(Body, correct_answer, answer_variants);
        }
    }
    public static void showQuestion (Question question) {
        System.out.println();
        System.out.println();
        System.out.println("Текст вопроса: " + question.Body);
        System.out.println();
        System.out.println("Варианты ответов: " + question.answer_variants);
        System.out.println();
        System.out.println("Правильный ответ: " + question.correct_answer);
  

    }
}

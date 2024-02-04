package src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class UserAnswer{
    Set userAnswers;
    
    public static Set FillAnswers(){
        Set userAnswers = new HashSet<>();
        System.out.println("Введите ответы, после каждого ответа Нажмите Enter, для завершения ввода выберите 0: ");
        Scanner scaner = new Scanner(System.in);
        Integer answer;
        while (true) 
        {
            answer =  scaner.nextInt();
            
            if (answer.equals(0)) {
                System.out.println(userAnswers);
                return userAnswers; 
            }
            userAnswers.add(answer);
        }  
    }
}
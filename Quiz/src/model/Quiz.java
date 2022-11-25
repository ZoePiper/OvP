package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
private ArrayList<Question>questions;
/** Construct quiz with no questions
 * When instantiating you are making a new array
 */
    public Quiz() {
        questions = new ArrayList<Question>();
    }

    /** Adds a question to this quiz
     * @param q the question
     */
    public void addQuestion(Question q){
        questions.add(q);
    }
    /** Present the question to the user and checks the response.
     */
    public void presentQuestion(){
        Scanner scanner = new Scanner(System.in);
        for (Question q:questions
             ) {
            q.display();
            System.out.print("If it's multipal choose prompt a number otherwise prompt your answer: ");
            String response = scanner.nextLine();
            System.out.println(q.checkAnswer(response));

        }
    }
}

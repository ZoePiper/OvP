package model;

public class Question {
    //Question with text and an answer

    private String text;
    private String answer;

    // Constructor that is empty
    public Question() {
    }

    /**
     * Sets the questionText
     * //@param questionText the text of this question
     */
    public void setText(String questionText) {
        this.text = questionText;
    }

    /**
     * Sets the questionAnswer
     * //@param correctRespons the answer
     */
    public void setAnswer(String correctResponse) {
        this.answer = correctResponse;
    }

    /**
     *     Check a given response for correctness
     * @param response the respons to check
     * @return true if the respons was correct, false otherwise
     */
    public String checkAnswer(String response){
        // Changed into string so output of true/false is printed correct/wrong
        if ( response.equals(answer)){
            return "Correct answer";
        }else {
            return "Wrong answer";
        }

    }
/**
 * Display the question
 */
public void display(){
    System.out.println(text);
}
}

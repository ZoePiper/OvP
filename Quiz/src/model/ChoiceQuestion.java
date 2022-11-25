package model;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    /**
     * Construct a choice with no choice.
     * When instantiating you are making a list
     */
    public ChoiceQuestion() {
        choices=new ArrayList<String>();
    }

    /**
     * Adds an answer choice to this question
     *
     * @param choice  the choice to add
     * @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            //Convert choices.size() to string
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    public void display() {
        //Display the question text form the super class
        super.display();//text from question
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}

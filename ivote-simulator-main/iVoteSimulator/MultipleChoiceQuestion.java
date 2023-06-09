package iVoteSimulator;

import java.util.Set;

// Define a class for multiple-choice questions that implements the Question interface
public class MultipleChoiceQuestion implements Question {
    private String question;
    private Set<String> options;

    // Constructor for a multiple-choice question, taking the question text and options as parameters
    public MultipleChoiceQuestion(String question, Set<String> options) {
        this.question = question;
        this.options = options;
    }

    // Getter method for the question text
    public String getQuestion() {
        return question;
    }

    // Getter method for the options
    public Set<String> getOptions() {
        return options;
    }

    // Since this is a multiple-choice question, this method always returns true
    public boolean isMultipleChoice() {
        return true;
    }
}

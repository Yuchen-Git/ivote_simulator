package iVoteSimulator;

import java.util.Set;

// Define a class for single-choice questions that implements the Question interface
public class SingleChoiceQuestion implements Question {
    private String question;
    private Set<String> options;

    // Constructor for a single-choice question, taking the question text and options as parameters
    public SingleChoiceQuestion(String question, Set<String> options) {
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

    // Since this is a single-choice question, this method always returns false
    public boolean isMultipleChoice() {
        return false;
    }
}

package iVoteSimulator;

import java.util.Set;

// Defining a Question interface that represents a question that can be answered in the iVote system
public interface Question {

    // Method to get the text of the question
    String getQuestion();

    // Method to get the available options for the question
    Set<String> getOptions();

    // Method to check if the question is a multiple-choice question or not
    boolean isMultipleChoice();
}

package iVoteSimulator;

import java.util.Set;

// Define a class for a student, who can submit answers to questions
public class Student {
    private String id;
    private Set<String> answers;

    // Constructor for a student, taking a unique identifier as a parameter
    public Student(String id) {
        this.id = id;
    }

    // Getter method for the student's identifier
    public String getId() {
        return id;
    }

    // Setter method for the student's answers
    public void setAnswers(Set<String> answers) {
        this.answers = answers;
    }

    // Getter method for the student's answers
    public Set<String> getAnswers() {
        return answers;
    }
}

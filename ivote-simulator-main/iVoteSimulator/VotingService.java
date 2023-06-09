package iVoteSimulator;

import java.util.*;

// Define a class for the voting service, which accepts submissions and keeps track of the results
public class VotingService {
    private Question question;
    private Map<String, Student> students;

    // Constructor for the voting service, taking a Question as a parameter
    public VotingService(Question question) {
        this.question = question;
        // Initialize students map to store student's answers
        this.students = new HashMap<>();
    }

    // Method to allow a student to submit their answer(s)
    public void submitAnswer(Student student) {
        // Use student's id as key, and the whole student object as value
        students.put(student.getId(), student);
        System.out.println("Student " + student.getId() + " chose answer(s): " + student.getAnswers());
    }

    // Method to print the statistics of the voting results
    public void printStatistics() {
        Map<String, Integer> stats = new HashMap<>();
        // Count the number of students who chose each answer
        for (Student student : students.values()) {
            for (String answer : student.getAnswers()) {
                stats.put(answer, stats.getOrDefault(answer, 0) + 1);
            }
        }

        // Print the number of students who chose each option
        for (String option : question.getOptions()) {
            System.out.println(option + ": " + stats.getOrDefault(option, 0));
        }
    }
}

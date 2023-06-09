package iVoteSimulator;

import java.util.*;

public class SimulationDriver {
    public static void main(String[] args) {
        // Creating a multiple-choice question with 3 options
        Question multipleChoiceQuestion = new MultipleChoiceQuestion("What's your favorite color?",
                new HashSet<>(Arrays.asList("A. Red", "B. Green", "C. Blue")));

        // Creating a single-choice question with 2 options
        Question singleChoiceQuestion = new SingleChoiceQuestion("Is Java object-oriented?",
                new HashSet<>(Arrays.asList("1. Right", "2. Wrong")));

        // Simulating voting process for both questions
        simulateVoting(multipleChoiceQuestion);
        simulateVoting(singleChoiceQuestion);
    }

    private static void simulateVoting(Question question) {
        // Creating a VotingService with a specific question
        VotingService votingService = new VotingService(question);

        // Displaying the question and available options
        System.out.println("Question: " + question.getQuestion());
        System.out.println("Available choices: " + question.getOptions());

        Random random = new Random();
        // Randomly generate the number of students
        int studentCount = (int) (Math.random() * 50) + 1;
        for (int i = 0; i < studentCount; i++) {
            // Creating a new student with a unique ID
            Student student = new Student("student" + i);
            Set<String> answers = new HashSet<>();
            // If the question is multiple choice, each student can submit more than one answer, otherwise one answer only
            int numberOfAnswers = question.isMultipleChoice() ? random.nextInt(question.getOptions().size()) + 1 : 1;
            List<String> options = new ArrayList<>(question.getOptions());
            for (int j = 0; j < numberOfAnswers; j++) {
                // Randomly selecting answers for the student
                answers.add(options.get(random.nextInt(options.size())));
            }
            // Submitting the student's answer(s) to the VotingService
            student.setAnswers(answers);
            votingService.submitAnswer(student);
        }

        // Displaying the total number of students
        System.out.println("Total students: " + studentCount);
        // Displaying the voting results
        votingService.printStatistics();
    }
}

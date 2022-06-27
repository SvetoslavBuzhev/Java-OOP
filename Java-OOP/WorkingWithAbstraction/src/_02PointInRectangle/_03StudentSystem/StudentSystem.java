package _03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repository;

    public StudentSystem() {
        this.repository = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repository;
    }

    public void executeCommand(String[] command) {
        String commandName = command[0];
        String name = command[1];
        if (commandName.equals("Create")) {
            createStudent(command, name);
        } else if (command[0].equals("Show")) {
            showStudent(name);
        }
    }

    private void showStudent(String name) {
        if (repository.containsKey(name)) {
            Student student = repository.get(name);
            StringBuilder output = new StringBuilder(student.toString());
            if (student.getGrade() >= 5.00) {
                output.append(" Excellent student.");
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                output.append(" Average student.");
            } else {
                output.append(" Very nice person.");
            }
            System.out.println(output);
        }
    }

    private void createStudent(String[] command, String name) {
        int age = Integer.parseInt(command[2]);
        double grade = Double.parseDouble(command[3]);
        Student student = new Student(name, age, grade);
        repository.putIfAbsent(name, student);
    }
}

package Instructor;

public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        instructor.setEmployeeNumber(" CS 456 ");
        instructor.setFirstName("John");
        instructor.setLastName("Doe");
        instructor.setEmail("john.doe@university.edu");
        instructor.setPhone("(+555) 987-6543");

        Subject subject = new Subject();
        subject.setCode(" intro-101 ");
        subject.setTitle("introduction to computer science");

        System.out.println("INSTRUCTOR CARD:");
        System.out.println(instructor.toCard());

        System.out.println("Clean Employee #: " + instructor.cleanEmployeeNumber());
        System.out.println("Normalized Code: " + subject.normalizedCode());
        System.out.println("Proper Title: " + subject.properTitle());
        System.out.println("Is Intro Course: " + subject.isIntroCourse());
        System.out.println("Syllabus Line: " + subject.syllabusLine(instructor));
        System.out.println("Display Name: " + instructor.displayName());
        System.out.println("Summary Line: " + instructor.summaryLine());
    }
}

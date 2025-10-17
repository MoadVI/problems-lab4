package student;

import java.util.Objects;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    private static final int MAX_STUDENTS = 50;
    public Major(){
        this.id = nextId++;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount < students.length) {
            students[studentCount++] = s;
            s.setMajor(this);
        } else {
            System.out.println("Cannot add more students.Class is Full!");
        }
    }

    // Getters
    public int getId() {return this.id;}
    public int getStudentCount() {return this.studentCount;}
    public String getCode() {return this.code;}
    public String getName() {return this.name;}

    // Setters

    public void setName(String name) {this.name = name;}
    public void setCode(String code) {this.code = code;}




    // Display all students in the major
    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students are enrolled in " + name);
            return;
        }
        System.out.println("Students enrolled in " + name + ":");
        for(int i = 0; i<studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    public Student findStudentByCNE(String cne) {
        for (Student s : students) {
            if (s != null && Objects.equals(s.getCne(), cne)) {
                return s;
            }
        }
        return null;
    }
    public boolean removeStudent(String cne) {
        Student s = findStudentByCNE(cne);
        if (s != null) {
            for (int i = 0; i<studentCount; i++) {
                if (students[i].getCne().equals(cne)) {
                    for(int j = i; j < studentCount-1; j++) {
                        students[j] = students[j+1];
                    }
                    students[studentCount-1] = null;
                    studentCount--;
                    return true;
                }
            }
        }
        return false;
    }
    public double getOccupancyRate() {
        if (students.length == 0) return 0.0;
        return (studentCount * 100.0) / students.length;
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            sb.append(i + 1)
                    .append(". ")
                    .append(s.getCne())
                    .append(" ")
                    .append(s.getSecondName().toUpperCase())
                    .append(" ")
                    .append(s.getFirstName())
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "{" +
                "Id: " + id +
                ", Code: " + code +
                ", Name: " + name +
                ", Student Count: " + studentCount +
                "}";
    }


}

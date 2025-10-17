package student;

public class Test {
    public static void main(String[] args) {


        Major emines = new Major("56", "Emines");
        Major fms = new Major("89", "FMS");
        Major archi = new Major("12", "SAP+D");
        Major cs = new Major("23", "Computer Science");

        Student s1 = new Student("Amal", "Safi", "0600000000", "amal@mail.com", "22885676"); // default: CS
        Student s2 = new Student("Samir", "Alami", "0611111111", "samir@mail.com", "23585976"); // default: CS
        Student s3 = new Student("Sara", "Benali", "0622222222", "sara@mail.com", "24585976", emines);
        Student s4 = new Student("Omar", "Rahimi", "0633333333", "omar@mail.com", "25585976", fms);
        Student s5 = new Student("Lina", "Zaki", "0644444444", "lina@mail.com", "26585976", archi);

        cs.addStudent(s1);
        cs.addStudent(s2);
        emines.addStudent(s3);
        fms.addStudent(s4);
        archi.addStudent(s5);


        System.out.println("The list of students in the computer science major is:");
        cs.displayStudents();
        System.out.println(cs.getStudentListAsString());

        System.out.println(s1.getFullNameFormatted());
        System.out.println(cs.findStudentByCNE("228855676"));
        System.out.println(cs.getStudentCount());

        System.out.printf("Occupancy rate for %s: %.1f%%%n", cs.getName(), cs.getOccupancyRate());


        cs.removeStudent("22885676");
        cs.displayStudents();
        System.out.println(cs.getStudentCount());
        System.out.printf("Occupancy rate for %s: %.1f%%%n", cs.getName(), cs.getOccupancyRate());


    }
}

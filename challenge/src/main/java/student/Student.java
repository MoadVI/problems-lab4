package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {super();}
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(prenom, nom, telephone, email, cne, new Major("23", "Computer Science"));
    }

    // Getters

    public String getCne() {return this.cne;}
    public Major getMajor() {return this.major;}

    // Setters

    public void setCne(String cne) {this.cne = cne;}
    public void setMajor(Major major) {this.major = major;}

    public String  getFullNameFormatted() {
        return String.format("%s, %s", this.secondName.toUpperCase(), this.firstName);
    }



    @Override
    public String toString() {
        return "Student {" +
                "Id: " + id +
                ", Name: " + firstName + " " + secondName +
                ", CNE: " + cne +
                ", Major: " + major +
                ", Phone: " + phone +
                ", Email: " + email +
                "}";
    }
}


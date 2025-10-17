package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person() {}
    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
        // add others
    }
    public int getId() {return this.id;}
    public String getFirstName() {return this.firstName;}
    public String getSecondName() {return this.secondName;}
    public String getPhone() {return this.phone;}
    public String getEmail() {return this.email;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setSecondName(String secondName) {this.firstName = secondName;}
    public void setPhone(String phone) {this.firstName = phone;}
    public void setEmail(String email) {this.firstName = email;}

    @Override
    public String toString() {
        return "Id: " + id + ", First Name: " + firstName +
                ", Second Name: " + secondName + ", Phone: " + phone + ", Email: " + email;
    }
}



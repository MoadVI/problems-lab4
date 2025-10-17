package Instructor;

public class Instructor {
    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String email;
    private String phone;

    public String cleanEmployeeNumber() {
        if (employeeNumber == null) {
            return null;
        }
        return employeeNumber.trim().replace(" ", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber, lastName, firstName);
    }

    public String toCard() {
        return """
           Instructor
           ----------
           Employee #: %s
           Name    : %s, %s
           Email   : %s
           Phone   : %s
           """.formatted(employeeNumber, lastName, firstName, email, phone);
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null && !firstName.trim().isEmpty()) {
            sb.append(firstName);
            if (lastName != null && !lastName.trim().isEmpty()) {
                sb.append(" ");
            }
        }
        if (lastName != null && !lastName.trim().isEmpty()) {
            sb.append(lastName);
        }
        return sb.toString();
    }

    public String getEmployeeNumber() { return employeeNumber; }
    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
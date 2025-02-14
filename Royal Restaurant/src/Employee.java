import java.time.LocalDate;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private String role;
    private LocalDate dateOfHire;
    private float salary;

    public Employee (int id, String lastName, String firstName, String role, LocalDate dateHire, float salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.role = role;
        this.dateOfHire = dateHire;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        this.dateOfHire = date;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        String answer = "Employé : " + firstName + lastName 
                        + ", Poste : " + role 
                        + ", Date d'embauche : " + dateOfHire 
                        + ", Salaire : " + salary;
        return answer;
    }
}

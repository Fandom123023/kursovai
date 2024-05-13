import java.util.Objects;
public class Employee {
    private int department;
    private int id;
    private String firstName;
    private String surname;
    private String lastName;
    private float salary;
    private static int idCounter;

    public Employee(String firstName, String surname, String lastName, int department, int salary) {
        this.department = department;
        this.firstName = firstName;
        this.surname = surname;
        this.lastName = lastName;
        this.salary = salary;
        this.id = counterId();
    }

    private static int counterId() {
        idCounter++;
        return idCounter;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return this.firstName + " " + this.surname + " " + this.lastName + " " + this.department + " " + this.salary +
                " " + this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.surname, this.lastName, this.department, this.id, this.salary);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.lastName, ((Employee) o).lastName) &&
                Objects.equals(this.firstName, ((Employee) o).firstName) &&
                Objects.equals(this.surname, ((Employee) o).surname) &&
                Objects.equals(this.id, ((Employee) o).id) &&
                Objects.equals(this.department, ((Employee) o).department) &&
                Objects.equals(this.salary, ((Employee) o).salary);

    }
}

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
        this.lastName = lastName;}
}

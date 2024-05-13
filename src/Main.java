import java.sql.SQLOutput;

public class Main {
    public static Employee[] employees = new Employee[10];
    public static void printAllEmployees(){
        for (int i=0;i<employees.length;i++){
            System.out.println(employees[i].toString());

        }
    }
    public static int salary1 =0;
    public static void printAllSalary(){
        for (int i=0;i<employees.length;i++){

            salary1= (int) (salary1+employees[i].getSalary());
        }
        System.out.println(salary1);
    }
    public static void printMinSalary(){
        int minSalary= (int) employees[0].getSalary();
        for (int i=0;i<employees.length;i++){
            if (employees[i].getSalary()<minSalary){
                minSalary= (int)employees[i].getSalary();
            }
        }
        System.out.println(minSalary);
    }
    public static void printMaxSalary(){
        int maxSalary= (int) employees[0].getSalary();
        for (int i=0;i<employees.length;i++){
            if (employees[i].getSalary()>maxSalary){
                maxSalary= (int)employees[i].getSalary();
            }
        }
        System.out.println(maxSalary);
    }
    public static void printMiddleSalary(){
        int middleSalary = salary1/employees.length;
        System.out.println(middleSalary);
    }
    public static void printFullName(){
        for (int i=0;i<employees.length;i++){
            System.out.println(employees[i].getFirstName()+" "+employees[i].getSurname()+" "+employees[i].getLastName());
        }
    }
    public static void main(String[] args){
        employees[0] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[1] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[2] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[3] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 80_000);
        employees[4] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[5] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 30_000);
        employees[6] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[7] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[8] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        employees[9] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);


        printAllEmployees();
        printAllSalary();
        printMinSalary();
        printMaxSalary();
        printMiddleSalary();
        printFullName();

    }
    }
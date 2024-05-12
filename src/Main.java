import java.sql.SQLOutput;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args){

        employees[0] = new Employee("Магомед", "Магомедов", "Магомедович", 1, 50_000);
        System.out.println(employees[0].getFirstName());
        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString));{
            for (int i =0; i<employees.length;i++){

            }
        }

        // Посчитать сумму затрат на ЗП в месяц;
        // Найти сотрудника с минимальной ЗП;
        // Найти сотрудника с максимальной ЗП;
        // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
        // Распечатать ФИО всех сотрудников (метод ничего).
        //

    }
}